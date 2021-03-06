# Java Programming Masterclass For Software Developers

     This project is an effort to learn Java so that I can do side work on Minecraft plugins for a minecraft server. 

     Source code. Type in the code as you see the instructor types in the code.  Gain experience by doing what you see.  It is reccommended that you watch the video once, then watch it again while typing in the code as you follow along.  Each lecture has a resources section where you can download the source code for the course. 

# Software Tools Setup
     Installing the software. JDK Version 11 for Windows, Amazon Coretto. IntelliJ IDEA for windows or you can use the IDE you are familiar with.  I am using VS Code.
     Install language support for java by red hat, project manager for java, maven for java, java coding pack for vs code and spring boot tools, debugger for java, java test runner.  Also need to install the microsoft .NET SDK for running the java programs with vsc.  I am noting these installations so that I can remove them at a later date if needed as well as to highlight how I got to this place now.  After installing these things, there are no more errors when I try to compile and run the code for the first part of the course.

# First Java Project Hello World & Project Challenge.
     Created a HelloWorld.java project, created the code to print Hello World to the terminal window, used a public static main class to do this with the System.out.println() function. 
     Challenge: Modify the Hello World program so that it prints out Hello Thomas or Hello and the first name of the person or persons creating the program.   To do this was pretty simple, I remove the word world and replace it with my name or the name of the person writing the code. 

     Variables are a way to store information in our computer.  Variables that we define in a program can be accessed by a name we give them, and the computer does the hard work of figuring out where they get stored in the computers random access memory (RAM).

     Starting out with expressions.  The challenge is to declare the following variables and add them to the HelloWorld program.  
          mySecondNumber which is an int and assign a value of 12 to it.
          myThirdNumber which is also an int and has a value of 6. 
     Last challenge, create a new variable called myLastOne that is 1000 less the current value of myTotal. 

# Primitive Types
     8 primitive types. 
          byte - occupies 8 bits. A byte has a width of 8
          integer - occupies 32 bits has a wdith of 16
          short - occupies 16 bits, has a width of 16
          long - occupies 2 to the power of 63 , has a width of 64

# Casting in Java

     Casting - to treat or convert a number from one type to another.  We put the type we want the number to be in parenthesis like this (byte)(myMinByteValue/2)

     Primitive types challenge.
          Create a byte variable and set it to any valid byte number.  Create a short variable and set it to any valid short number.

          Create an int variable and set it to any valid int number.  Lastly create a variable of type long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer. 

# Float and double Primitive types
     
          Floating point numbers have fractional parts that we express with a decimal point. 3.14159 is an example.
          Floating point numbers are also known as real numbers.  We use floating point numbers when we need more precision in calculations.

     Precision: 
          refers to the format and amount of space occupied by the type.  Single precision occupies 32 bits(so it has a width of 32) and a double precision occupies 64 bits(and thus has a width of 64)

     float is a single precision number and a double is a double precision number. 

     Challenge: 
          Convert a given number of pounds to kilograms.
               Steps: 
                    1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
                    2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable.
                    3. Print out the result.

                    Hint: 1 pound is equal to 0.45359237 of a kilogram.  This should help you perform the calculation. 

                    In general float and double are great for general floating point operations.  But both are not great to use where precision calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java specific problem as such. 

                    Java has a class called BigDecimal that overcomes this.  Keep in mind that when precise calculations are required such as when performing currency calculations, floating-point types should NOT be used. 

# Operators, Operands and Expressions

     Operators in Java are special symbols that perform specific operations on one, two, or three operands, and 
     then return a result.  As an example we used the + (addition) operator to sum the value of two variables in previous lessons. 

     Operand is a term used to describe any object that is manipulated by an operator.  Consider the following statement. int myVar = 15 + 12;
     the + is the operator and the 15 and the 12 are the operands. 

     Expressions are formed by combining variables, literals, method return values and operators.
     In the above statement 15 + 2 is the expression.

# If-then statements in Java

     The if-then statement is the most basic of all the control flow statements.  It tells your program to execute a certain section of code only if a particular test evaluates to true.  This is known as conditional logic.
     
# DiffMerge Tool

     DiffMerge is a program that will help you to visually compare and merge files on any operating system.
     
# Control Flow Statements
     Switch Statements

# Naming conventions

     Packages - always lowercase, should be unique, user your internet domain name, reversed as a prefix for the package name. Oracle specify a convention for package names at http://docs.oracle.com/javase/specs/jls/se6/html/packages.html#7. Replace invalid characters (i.e. -) in domain name with an underscore. Domain name components starting with a number should instead start with an underscore.  Domain name components that are Java keywords should have those components start with an underscore.Examples of package names - invalid on the left side and valid on the right side:
          Switch.supplier.com ---> com.supplier._switch
          1World.com ---> com._1world
          Experts-exchange.com ---> com.experts_exchange
          Example package names:
               java.lang
               java.io
               org.xml.sax.helpers
               com.timbuchalka.autoboxing

     Classes - should use camelCase, should be nouns, start with a capital letter.  Each word in the name should also start with a capital letter.
          Example class names:
               ArrayList
               LinkedList
               String
               TopSong
               GearBox
               Main

     Interfaces - capitalized like classnames, also CamelCase.  Consider what objects implementing the interface will become of what they will be able to do.
          Examples:
               List
               Comparable
               Serializeable

     Methods - should be mixedCase, often verbs.  Should reflect the function performed or the result returned.
          Examples:
               size()
               getName()
               addPlayer()

     Constants - values that will never change. All uppercase, seperate words with an underscore and declared using the final keyword.
          Examples:
               Static final int MAX_INT
               Static final short SEVERITY_ERROR
               Static final double PI = =3.141592653

     Variables - mixedCase, Meaningful and indicative,  don't use underscores.
          Examples:
               i
               league
               sydneySwans
               boxLength

     Type Parameters - Single character, capital letters, guidelines given at https://docs.oracle.com/javase/tutorial/generics/types.html.  
          Examples:
               E - Element (used extensively by the Java Collections Framework)
               K - Key
               T - Type
               V - Value
               S, U, V, etc - 2nd, 3rd, 4th types








     

     