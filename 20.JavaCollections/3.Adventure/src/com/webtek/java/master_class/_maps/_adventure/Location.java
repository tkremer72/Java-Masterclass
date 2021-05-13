package com.webtek.java.master_class._maps._adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {

    //Create the fields
    private final int locationID;
    private final String description;
    private final Map<String, Integer>  exits;

    //Create a constructor and initialize the fields
    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    //Create the ability to add an exit
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    //Create getters for the fields
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);//returns a copy of exits
    }

}
