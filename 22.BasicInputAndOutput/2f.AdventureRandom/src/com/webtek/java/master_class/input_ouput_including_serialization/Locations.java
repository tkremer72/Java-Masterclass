package com.webtek.java.master_class.input_ouput_including_serialization;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private final static Map<Integer, Location> locations = new LinkedHashMap<>();
    private static Map<Integer, IndexRecord> index = new HashMap<>();

    private static RandomAccessFile randomAccessFile;

    public static void main(String[] args) throws IOException {
        //Using the serializable interface
        try(RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size());
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
            rao.writeInt(locationStart);

            long indexStart = rao.getFilePointer();

            int startPointer = locationStart;
            rao.seek(startPointer);
            for(Location location : locations.values()) {
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder = new StringBuilder();
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                    }
                }
                rao.writeUTF(builder.toString());

                IndexRecord record = new IndexRecord(startPointer, (int) rao.getFilePointer() - startPointer);
                index.put(location.getLocationID(), record);

                startPointer = (int) rao.getFilePointer();
            }

            rao.seek(indexStart);
            for(Integer locationID : index.keySet()) {
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }
        }
    }//Locations Main Method closing brace.

    //1. This first four bytes will contain the number of locations (bytes 0-3)
    //2. The next four bytes will contain the start of the locations section (4-7)
    //3. The next section of the file will contain the index (the index is 1692 bytes long. It will start at byte 8 and end at byte 1699.
    //4. The final section of the file will contain the location records (the data).  It will start at byte 1700.

    static {//This block of code gets initialized once
        try {
            randomAccessFile = new RandomAccessFile("locations_rand.dat", "rwd");
            int numberOfLocations = randomAccessFile.readInt();
            long locationStartPoint = randomAccessFile.readInt();
            while(randomAccessFile.getFilePointer() < locationStartPoint) {
                int locationId = randomAccessFile.readInt();
                int locationStart = randomAccessFile.readInt();
                int locationLength = randomAccessFile.readInt();

                IndexRecord record = new IndexRecord(locationStart, locationLength);
                index.put(locationId, record);
            }
        } catch(IOException e) {
            System.out.println("IO Exception Thrown In Static Initializer: " + e.getMessage());
        }

    }

    public Location getLocation(int locationId) throws IOException {
        IndexRecord record = index.get(locationId);
        randomAccessFile.seek(record.getStartByte());
        int id = randomAccessFile.readInt();
        String description = randomAccessFile.readUTF();
        String exits = randomAccessFile.readUTF();
        String[] exitPart = exits.split(",");

        Location location = new Location(locationId, description, null);

        if(locationId != 0) {
            for(int i = 0; i < exitPart.length; i++) {
                System.out.println("exitPart = " + exitPart[i]);
                System.out.println("exitPart[+1] = " + exitPart[i+1]);
                String direction = exitPart[i];
                int destination = Integer.parseInt(exitPart[++i]);
                location.addExit(direction, destination);
            }
        }
        return location;
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }

    public void close() throws IOException {
        randomAccessFile.close();
    }
}
