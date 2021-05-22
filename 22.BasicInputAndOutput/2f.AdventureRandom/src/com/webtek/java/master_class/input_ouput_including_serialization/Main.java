package com.webtek.java.master_class.input_ouput_including_serialization;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Locations locations = new Locations();


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);



        //Map words to letters to allow the user to type a word as a response.
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        Location currentLocation = locations.getLocation(1);
        while(true) {
            System.out.println(currentLocation.getDescription());
            if(currentLocation.getLocationID() == 0) {
                break;
            }

            Map<String, Integer> exits = currentLocation.getExits();//retrieve the map of valid exits

            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            //check the users input
            if(direction.length() > 1) { //more than one character, need extra processing
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                currentLocation = locations.getLocation(currentLocation.getExits().get(direction));
            } else {
                System.out.println("You cannot go in that direction!");
            }
        }
        locations.close();
    }

}
