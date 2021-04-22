
        public class Main {

            public static void main(String[] args) {

                float myMinFloatValue = Float.MIN_VALUE;
                float myMaxFloatValue = Float.MAX_VALUE;
                System.out.println("Float Minimum Value = " + myMinFloatValue);
                System.out.println("Float Maximum Value = " + myMaxFloatValue);

                double myMinDoubleValue = Double.MIN_VALUE;
                double myMaxDoubleValue = Double.MAX_VALUE;
                System.out.println("Double Minimum Value = " + myMinDoubleValue);
                System.out.println("Double Maximum Value = " + myMaxDoubleValue);

                int myIntValue = 5 / 3;
                float myFloatValue = 5f / 3f;
                double myDoubleValue = 5d / 3d;

                System.out.println("My Integer Value = " + myIntValue);
                System.out.println("My Float Value = " + myFloatValue);
                System.out.println("My Double Value = " + myDoubleValue);
            //Challenge convert given number of pounds to kilograms
                    //create a variable with the appropriate type to store the
                    //number of pounds to be converted to kilograms
                    //Calculate the result i.e. the number of kilograms based on the contents of the
                    //variable above and store the result in a second appropriate variable
                    //Print out the result
                //Hint: 1 pound is equal to 0.45359237 of a kilogram.  This should help you with the calculation

                double numberOfPounds = 200d;
                double convertedKilograms = numberOfPounds * 0.45359237d;

                System.out.println("Converted Kilograms = " + convertedKilograms);

                double pi = 3.1415927d;
                double anotherNumber = 3000000.4567890d;

                System.out.println("Pi = " + pi);
                System.out.println("Another number = " + anotherNumber);

            }
        }

