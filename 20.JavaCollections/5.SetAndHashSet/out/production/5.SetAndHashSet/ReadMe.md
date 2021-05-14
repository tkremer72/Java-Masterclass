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