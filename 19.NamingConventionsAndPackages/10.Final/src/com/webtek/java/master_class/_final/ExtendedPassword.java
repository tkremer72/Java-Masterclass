package com.webtek.java.master_class._final;

public class ExtendedPassword extends Password {
    //Create fields
    private int decryptedPassword;
    //create constructor to initialize fields
    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }
    //Create a method to over ride the store password method
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
