package com.webtek.java.master_class._static;

public class StaticTest {
    //Create fields or variables
    private static int numInstances = 0;
    private String name;
    //Create a constructor to initialize fields
    public StaticTest(String name) {
        this.name = name;
        numInstances++; //increment numInstances everytime the constructor is called.
    }
    //Create getters for both fields.
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
