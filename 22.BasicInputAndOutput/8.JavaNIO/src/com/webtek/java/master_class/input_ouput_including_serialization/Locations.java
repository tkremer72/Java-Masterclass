package com.webtek.java.master_class.input_ouput_including_serialization;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private final static Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        //Below is using the java.nio package to write the files.
//            Path locationPath = FileSystems.getDefault().getPath("locations_big.txt");
//            Path directionsPath = FileSystems.getDefault().getPath("directions_big.txt");
//            try(BufferedWriter locationsFile = Files.newBufferedWriter(locationPath);
//                BufferedWriter directionsFile = Files.newBufferedWriter(directionsPath )) {
//                for(Location location : locations.values()) {
//                    locationsFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                    for(String direction : location.getExits().keySet()) {
//                        if(!direction.equalsIgnoreCase("Q")) {
//                            directionsFile.write(location.getLocationID() + "," + direction + "," +
//                                    location.getExits().get(direction) +  "\n");
//                        }
//                    }
//                }
//            } catch(IOException io) {
//                System.out.println("I/O Exception Thrown: " + io.getMessage());
//            }

                //Below is using the java.nio package to write the objects using serialization
        Path locationsPath = FileSystems.getDefault().getPath("locations.dat");
        try(ObjectOutputStream locationsFile = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(locationsPath)))){
            for(Location location : locations.values()) {
                locationsFile.writeObject(location);
            }
        }

    }//Locations Main Method closing brace.

    static {
        ///Write the data to the files
//        Path locationPath = FileSystems.getDefault().getPath("locations_big.txt");
//        Path directionsPath = FileSystems.getDefault().getPath("directions_big.txt");
//
//        try(Scanner scanner = new Scanner(Files.newBufferedReader(locationPath))) {
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported location: " + loc + ": " + description);
//                locations.put(loc, new Location(loc, description, null));
//            }
//        } catch(IOException io) {
//            System.out.println("I/O Exception Thrown! " + io.getMessage());
//            io.printStackTrace();
//        }
//        //Read the data from the files.
//        try(BufferedReader directionsFile = Files.newBufferedReader(directionsPath)) {
//            String input;
//            while((input = directionsFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch(IOException io) {
//            System.out.println("I/O Exception Thrown! " + io.getMessage());
//            io.printStackTrace();
//        }

            Path locationsPath = FileSystems.getDefault().getPath("locations.dat");
            try(ObjectInputStream locationsFile = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(locationsPath)))) {
                boolean isEOF = false;
                while (!isEOF) {
                    try {
                        Location location = (Location) locationsFile.readObject();
                        locations.put(location.getLocationID(), location);
                    } catch (EOFException e) {
                        isEOF = true;
                        //System.out.println("EOF Exception Thrown! " + e.getMessage());
                        //e.printStackTrace();
                    }
                }
            } catch(ClassNotFoundException cnf) {
                System.out.println("Class Not Found Exception Thrown! " + cnf.getMessage());
                //cnf.printStackTrace();
            }catch(InvalidClassException ic) {
                System.out.println("Invalid Class Exception Thrown! " + ic.getMessage());
                //ic.printStackTrace();
            } catch(IOException io) {
                System.out.println("I/O Exception Thrown! " + io.getMessage());
                //io.printStackTrace();
            }

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
