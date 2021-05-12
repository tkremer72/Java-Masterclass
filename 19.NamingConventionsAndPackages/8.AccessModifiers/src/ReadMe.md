# Access Modifiers

Access control is granted both at the top level or at the member level.

At the top level you can make your classes and interfaces public or package private.
You can't define a private class at the top level.  Only classes, interfaces and enums
can exist at the top level, everything else must be included within one of these:

Top level:

Public: the object is visible to all classes everywhere, whether they are in the 
same package or have imported the package containing the public class.

Package-private: the object is only available within its own package (and is
visible to every class within the same package).  Package-private is specified by
not specifying, i.e. it is the default if you do not specify public.  There is not a 
"package-private" keyword.

Member level:

public: at the member level, public has the same meaning as at top level.  A public class
member (or field) and public method can be accessed from any other class anywhere, even in a 
different package.

Package-private: this also has the same meaning as it does at the top level.  An object with
no access modifier is visible to every class within the same package (but not to classes in 
external packages).

private: the object is only visible within the class it is declared.  It is not visible anywhere
else (including in subclasses of its class).

Protected: the object is visible anywhere in its own package (like package-private) but also in
subclasses even if they are in another package.

All methods in an interface are public.  
