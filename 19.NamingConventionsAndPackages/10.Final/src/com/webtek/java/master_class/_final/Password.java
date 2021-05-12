package com.webtek.java.master_class._final;

public class Password {

    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {//using final keeps method from being over ridden and protects resources and assets when needed.
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("Nope, you cannot come in!");
            return false;
        }
    }
}
