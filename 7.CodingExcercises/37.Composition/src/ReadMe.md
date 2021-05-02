# Composition
Directions: 
This is an exercise in Class composition.  To complete the exercise, you must create five classes
with associated member variables and methods.

The five classes should be created as follows

1. Create a class and name it Lamp. Inside this class should be declared three member variables:
style of type String, batter of type boolean, and globeRating of type int.  All variables
   should be marked private.  A constructor needs to be created which accepts the three member
   variables as parameters.  In addition, four methods should also be created: turnOn() has no 
   return type and should print a message that the lamp is being turned on; getStyle() returns the
   lamp style; isBattery returns the value of battery; and getGlobeRating returns the 
   globeRating of the lamp.
   
2. Create a class and name it Bed.  Five private member variables should be declared: style of
type String, and pillows, height, sheets, quilt of type int.  A constructor should be coded which
   accepts these five member variables as parameters.  Also six methods should be defined:
   make() has no return type and prints a message to the effect that the bed is being made; getStyle()
   which returns the value of style; getPillows() returns the number of pillows; getHeight() returns
   the height of the bed; getSheets() returns the number of sheets on the bed and getQuilt() returns 
   the value of quilt.
   
3. Create a class with the name Ceiling.  There are two member variables for this one, height and
paintedColor, both of type int.  There should also be a constructor which accepts both member variables
   as parameters.  There are also two additional methods which should be defined:
   getHeight() shall return the value of height and getPaintedColor() should return the value of 
   paintedColor.
   
4. Create a class with the name Wall.  It contains one member variable, direction, and is of type
String.  A constructor for Wall should accept one parameter for the member variable direction.  A
   getter should also be defined for the direction field called getDirection().
   
5. Create a class with the name Bedroom.  This class contains 8 member variables
name of type String, wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling;
   bed of type Bed and lamp of type Lampt.  The class constructor should accept all eight of 
   the member variables as parameters, and there should also be two additional methods.
   getLamp() which returns an object of type Lamp, and makeBed() which prints a message that
   the bed is being made and also calls the make() method in the bed class.          
   
Input/Output
Once you have completed coding your classes you should then use the following code in your 
main class to test your code and for correct output.  This way you can be sure that your code
works before pasting your five classes into the code evaluator.

Wall wall1 = new Wall("West");
Wall wall2 = new Wall("West");
Wall wall3 = new Wall("West");
Wall wall4 = new Wall("West");
Ceiling ceiling = new Ceiling(12, 55);
Bed bed = new Bed("Modern", 4, 3, 2, 1);
Lamp lamp = new Lamp("Classic", false, 75);
Bedroom bedRoom = new Bedroom("Thomas", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
bedRoom.makeBed();
bedRoom.getLamp()'