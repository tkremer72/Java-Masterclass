# Set & HashSet

A Set is a Collection that cannot contain duplicate elements. 
It models the mathematical set abstraction. ... Two Set instances 
are equal if they contain the same elements. The Java platform 
contains three general-purpose Set implementations: HashSet , 
TreeSet , and LinkedHashSet .

Java HashSet class is used to create a collection that uses a hash 
table for storage. It inherits the AbstractSet class and implements 
Set interface. ... HashSet stores the elements by using a mechanism 
called hashing. HashSet contains unique elements only. HashSet allows 
null value.

# hashCode documentation

public int hashCode()
Returns a hash code value for the object. This method is supported for the 
benefit of hash tables such as those provided by HashMap.

The general contract of hashCode is:

Whenever it is invoked on the same object more than once during an execution of 
a Java application, the hashCode method must consistently return the same integer, 
provided no information used in equals comparisons on the object is modified. 
This integer need not remain consistent from one execution of an application to 
another execution of the same application.

If two objects are equal according to the equals(Object) method, then calling the 
hashCode method on each of the two objects must produce the same integer result.

It is not required that if two objects are unequal according to the equals(java.lang.Object) 
method, then calling the hashCode method on each of the two objects must produce distinct 
integer results. However, the programmer should be aware that producing distinct integer 
results for unequal objects may improve the performance of hash tables.

As much as is reasonably practical, the hashCode method defined by class Object does return 
distinct integers for distinct objects. (This is typically implemented by converting the 
internal address of the object into an integer, but this implementation technique is not 
required by the Java™ programming language.)

Returns:
a hash code value for this object.
See Also:
equals(java.lang.Object), System.identityHashCode(java.lang.Object)

# equals documentation
public boolean equals(Object obj)
Indicates whether some other object is "equal to" this one.
The equals method implements an equivalence relation on non-null object references:

It is reflexive: for any non-null reference value x, x.equals(x) should return true.
It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if 
and only if y.equals(x) returns true.
It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true 
and y.equals(z) returns true, then x.equals(z) should return true.
It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) 
consistently return true or consistently return false, provided no information used in equals 
comparisons on the objects is modified.
For any non-null reference value x, x.equals(null) should return false.
The equals method for class Object implements the most discriminating possible equivalence 
relation on objects; that is, for any non-null reference values x and y, this method returns 
true if and only if x and y refer to the same object (x == y has the value true).

Note that it is generally necessary to override the hashCode method whenever this method is 
overridden, so as to maintain the general contract for the hashCode method, which states that 
equal objects must have equal hash codes.

Parameters:
obj - the reference object with which to compare.
Returns:
true if this object is the same as the obj argument; false otherwise.
See Also:
hashCode(), HashMap

# CHALLENGE
/**
* When overriding the equals() method in the HeavenlyBody class, we
* were careful to make sure that it would not return true if a HeavenlyBody
* was compared to a subclass of itself.
*
* We did that to demonstrate that method, but it was actually
* unnecessary in the HeavenlyBody class.
*
* The mini challenge is just a question: why was it unnecessary?
*
* Hint: If you are stuck, check out Lecture 97
*
* Answer:
*
* The HeavenlyBody class is declared final, so cannot be subclassed.
* The Java String class is also final, which is why it can safely
* use the instanceof method without having to worry about
* comparisons with a subclass.

     *
     **/
  
# Symmetric & Asymmetic Sets
Symetric appears in one set or the other 
Asymmetric appears in both sets.

# Set Challenge

Modify the previous HeavenlyBody example so that the HeavenlyBody
class also has a "bodyType" field. This field will store the
type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

You can include as many types as you want, but must support at
least PLANET and MOON.

For each of the types that you support, subclass the HeavenlyBody class
so that your program can create objects of the appropriate type.

Although astronomers may shudder at this, our solar systems will
allow two bodies to have the same name as long as they are not the
same type of body: so you could have a star called "BetaMinor" and
an asteroid also called "BetaMinor", for example.

Hint: This is much easier to implement for the Set than it is for the Map,
because the Map will need a key that uses both fields.

There is a restriction that the only satellites that planets can have must
be moons. Even if you don't implement a STAR type, though, your program
should not prevent one being added in the future (and a STAR's satellites
can be almost every kind of HeavenlyBody).

Test cases:
1. The planets and moons that we added in the previous video should appear in
the solarSystem collection and in the sets of moons for the appropriate planets.

2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.
   
3. Attempting to add a duplicate to a Set must result in no change to the set (so
the original value is not replaced by the new one).

4. Attempting to add a duplicate to a Map results in the original being replaced
by the new object.

5. Two bodies with the same name but different designations can be added to the same set.

6. Two bodies with the same name but different designations can be added to the same map,
and can be retrieved from the map.