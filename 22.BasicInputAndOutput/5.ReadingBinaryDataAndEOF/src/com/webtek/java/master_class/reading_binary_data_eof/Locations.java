package com.webtek.java.master_class.reading_binary_data_eof;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private final static Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        //Try with resources
        try(DataOutputStream locationsFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for(Location location : locations.values()) {
                locationsFile.writeInt(location.getLocationID());
                locationsFile.writeUTF(location.getDescription());
                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
                locationsFile.writeInt(location.getExits().size() - 1);
                for(String direction : location.getExits().keySet()) {
                    if(!direction.equalsIgnoreCase("Q")) {
                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
                        locationsFile.writeUTF(direction);
                        locationsFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }


    }//Locations Main Method closing brace.

    static {//This block of code gets initialized once
        //Below is used to read from the binary data file
        try(DataInputStream locationsFile = new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean isEOF = false;
            while(!isEOF) {
                try {
                    Map<String, Integer> exits = new LinkedHashMap<>();
                    int locationID = locationsFile.readInt();
                    String description = locationsFile.readUTF();
                    int numberOfExits = locationsFile.readInt();
                    System.out.println("Read Location " + locationID + " : " + description);
                    System.out.println("Found " + numberOfExits + " exits!");
                    for(int i = 0; i < numberOfExits; i++) {
                        String direction = locationsFile.readUTF();
                        int destination = locationsFile.readInt();
                        exits.put(direction, destination);
                        System.out.println("\t\t" + direction + "," + destination);
                    }
                    locations.put(locationID, new Location(locationID, description, exits));
                } catch(EOFException e) {
                    isEOF = true;
                }
            }
        } catch(IOException io) {
            System.out.println("IO Exception Thrown!");
        }
        //Read the locations
//        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported location: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//        //Read the exits
//        try (BufferedReader directionsFile = new BufferedReader(new FileReader("directions_big.txt"))) {
//            String input;
//            while((input = directionsFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

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
}
