package com.webtek.java_masterclass.coding_exercises.adventure_game;

import java.util.HashMap;
import java.util.Map;

public class Location {

    //Create the fields
    private final int locationID;
    private final String description;
    private final Map<String, Integer>  exits;

    //Create a constructor and initialize the fields
    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }


    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);//returns a copy of exits
    }

}
