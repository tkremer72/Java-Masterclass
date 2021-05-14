package com.webtek.java_masterclass.set_hashset;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {

    //Create the fields or variables
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    //Create the constructor to initialize the fields or variables
    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    //Create getters for name, oribtalPeriod, and satellites

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    //Return a new HashSet of our current object, a copy of the original
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    //Create the option to add a moon
    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }


}
