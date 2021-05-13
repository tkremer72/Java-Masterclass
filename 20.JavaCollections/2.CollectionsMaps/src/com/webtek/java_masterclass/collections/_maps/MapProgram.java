package com.webtek.java_masterclass.collections._maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")) {
            System.out.println("Java already exists!");
        } else {
            languages.put("Java", "a compiled high-level, object-oriented, platform independent language.");
            System.out.println("Java added successfully.");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics.");
        languages.put("Algol", "an algorithmic language.");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code."));
        System.out.println(languages.put("Lisp", "Therein lies madness."));

        //don't add a language if it already exists
        if(languages.containsKey("Java")) {//ensures an item is only added once and never overwritten
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println("==========================================================================");

        //Removing items from the map
        //languages.remove("Lisp");//remove based on key
        if(languages.remove("Algol", "a family of algorithmic languages")) {//remove based on key and value
            System.out.println("Algol removed!");
        } else {
            System.out.println("Algol not removed, key/value pair not found!");
        }

        //replace the entry for a key if it is already mapped to a value
        System.out.println(languages.replace("Lisp", "Binky von stinky."));//without a check
        //below is with a check
        if(languages.replace("Lisp", "This will not work", "a functional programming language with imperative features.")){
            System.out.println("Lisp was replaced!");
        } else {
            System.out.println("Lisp was not replaced!");
        }
        //System.out.println(languages.replace("Scala", "this will not be added."));

        //Looping through the sets of keys to print out values
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
