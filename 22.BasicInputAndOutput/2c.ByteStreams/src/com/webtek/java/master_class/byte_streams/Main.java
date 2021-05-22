package com.webtek.java.master_class.byte_streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Locations locations = new Locations();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        //Map words to letters to allow the user to type a word as a response.
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        int location = 1;
        //int location = 64;
        while(true) {
            System.out.println(locations.get(location).getDescription());
            if(location == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(location).getExits();//retrieve the map of valid exits

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
                location = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction!");
            }
        }
    }

}
