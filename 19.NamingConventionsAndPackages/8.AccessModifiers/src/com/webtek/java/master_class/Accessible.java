package com.webtek.java.master_class;

//Challenge:
//In the following interface declaration, what is the visibility of:
//
//1. The Accessible interface?
//2. the int variable SOME_CONSTANT?
//3. methodA?
//4. methodB and methodC?
//
//Hint: think back to the lecture on interfaces before answering.
interface Accessible {//package-private
    int SOME_CONSTANT = 100;//public
    public void methodA();//public
    void methodB();//public
    boolean methodC();//public
}
