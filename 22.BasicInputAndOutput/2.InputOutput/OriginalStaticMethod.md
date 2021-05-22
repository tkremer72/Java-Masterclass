# Locations.java static method

Original Locations.java static initialization block
Map<String, Integer> tempExit = new HashMap<>();
locations.put(0, new Location(0, "You are sitting in front of a computer learning Java.", tempExit));

        //Add exits for the rooms
        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
//      tempExit.put("Q", 0);
locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building.", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
//      tempExit.put("Q", 0);
locations.put(2, new Location(2, "You are at the top of a hill.", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
//      tempExit.put("Q", 0);
locations.put(3, new Location(3, "You are inside a building, a well house for a small spring.", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
//      tempExit.put("Q", 0);
locations.put(4, new Location(4, "You are in a valley beside a stream.", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
//      tempExit.put("Q", 0);
locations.put(5, new Location(5, "You are in the forest.", tempExit));
