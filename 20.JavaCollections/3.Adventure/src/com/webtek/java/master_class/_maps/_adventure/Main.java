package com.webtek.java.master_class._maps._adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java."));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building."));
        locations.put(2, new Location(2, "You are at the top of a hill."));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring."));
        locations.put(4, new Location(4, "You are in a valley beside a stream."));
        locations.put(5, new Location(5, "You are in the forest."));

        int location = 1;
        while(true) {
            System.out.println(locations.get(location).getDescription());
            if(location == 0) {
                break;
            }
            location = scanner.nextInt();
            if(!locations.containsKey(location)) {//very simple and basic validation
                System.out.println("You cannot go in that direction!");
            }
        }
    }


}
