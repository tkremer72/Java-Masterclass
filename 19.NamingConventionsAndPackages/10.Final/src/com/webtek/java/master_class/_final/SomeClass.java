package com.webtek.java.master_class._final;

public class SomeClass {
        //Create fields
    private static int classCounter = 0;
    public final int instanceNumber;//when using final, you would not make it public
    private final String name;

        //Create constructor and initialize fields
    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    //Create getter
    public int getInstanceNumber() {
        return instanceNumber;
    }
}
