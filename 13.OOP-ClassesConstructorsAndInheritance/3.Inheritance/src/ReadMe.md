# Inheritance

Super - to call a constructor for the class that you are extending or inheriting from
Extends - you can extend classes on and on as much as needed

Analogy building a house:

reference - Address, place where the house is located.

object - An instantiated instance of the house or instance.

instance - Each house is an object or an instance.

class - A class is a blueprint.  A reference to the object in memory.

Difference between this and super keywords

this - used to call the current class members
super - is used to access or call the parent class members

can use both anywhere in a class except in static areas
commonly used in setters optionally in getters.

In Java we have the this() call and the super() call.  Notice the braces it is known as a call
since it looks like a regular method call.

Use this() to call a constructor from another overloaded constructor in the same class.

The call to this() can be used only in a constructor, and it must be the first statement in a 
constructor.  It's used with constructor chaining, in other words when one constructor 
calls another constructor, and helps to reduce duplicated code.

The only way to call a parent constructor is by calling super().  This calls the parent constructor

The Java compiler puts a default call to super() if we don't add it, and it is always the no-args
super which is inserted by the compiler(constructor without arguments).

The call to super() must be the first statement in each constructor

Even Abstract classes have constructors, although you can never instantiate an abstract
class using the new keyword.
An abstract class is still a super class, so its constructors run when someone makes an
instance of a concrete subclass.

NOTE: A constructor can have a call to super() or this() but never to both.

BAD CONSTRUCTOR EXAMPLE:

class Rectangle {
private int x;
private int y;
private int width;
private int height;
}

public Rectangle() {
this.x = 0;
this.y = 0;
this.width = 0;
this.height = 0;
}
public Rectangle(int width, int height) {
this.x = 0;
this.y = 0;
this.width = width;
this.height = height;
}

public Rectangle(int x, int y, int width, int height) {
this.x = x;
this.y = y;
this.width = width;
this.height = height;
}

GOOD CONSTRUCTOR EXAMPLE:
class Rectangle {
private int x;
private int y;
private int width;
private int height;
}
//1st constructor
public Rectangle() {
    this(0, 0);//calls 2nd constructor
}
//2nd constructor
public Rectangle(int width, int height) {
    this(0, 0, width, height);//calls 3rd constructor
}
//3rd constructor
public Rectangle(int x, int y, int width, int height) {
    //initialize variables
this.x = x;
this.y = y;
this.width = width;
this.height = height;
}

SUPER CALL EXAMPLE:
class Shape {
private int x;
private int y;
public Shape(int x, int y) {
this.x = x;
this.y = y;
}
}
class Rectangle extends Shape {
private int width;
private int height;
//1st constructor
public Rectangle(int x, int y) {
this(x, y, 0, 0);//calls 2nd constructor
}
//2nd constructor
public Rectangle(int x, int y, int width, int height) {
super(x, y);//calls constructor from parent(Shape)
this.width = width;
this.height = height;
}
}

