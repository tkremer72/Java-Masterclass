# Immutable Classes

Immutability, to keep from being able to have unwanted modifications.

Immutability Challenge
Here is your challenge, and the challenges to work out what is wrong with
the location constructor that would allow the program to compile and crash
at runtime so when you identify the problem modify the code to fix it so I
just i’ll just say that again your challenge here is to work out what is wrong
with the location constructor that you can see on screen line 14 that will allow
the program to compile but crash on run time when you identify the problem modify
the code to fix it.

The solution is to test the location class constructors argument and don't try to 
initialize the new map if null is passed for the exit.
if(exits != null) {
this.exits = new HashMap<>(exits);
} else {
this.exits = new HashMap<>();
}