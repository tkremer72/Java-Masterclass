import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Hello {
     public static void main(String[] args) {
          System.out.println("Hello, Thomas!");

          int myFirstNumber = (10 + 5) + (2 * 10);//Just like JS you can use expressions 
          int mySecondNumber = 12;
          int myThirdNumber = myFirstNumber * 2;//lines 9-10 are part of second challenge
          int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

          System.out.println(myTotal);
          int myLastOne = 1000 - myTotal;
          System.out.println(myLastOne);


     }

}

