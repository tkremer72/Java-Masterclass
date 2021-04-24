public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }
//        int switchValue = 3;
//        switch(switchValue) {
//            case 1:
//                System.out.println("switchValue was 1");
//                break;
//            case 2:
//                System.out.println("switchValue was 2");
//                break;
//            case 3:case 4:case 5://Grouping multiple tests together in one line
//                System.out.println("switchValue was a 3 or 4 or 5 ");
//                System.out.println("The switchValue was actually a " + switchValue);
//                break;//Without the break, you get unpredictable results.
//            default:
//                System.out.println("switchValue was neither 1,2,3,4 or 5");
//        }
//Switch Statment Challenge
        char charValue = 'A';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Your character is neither A,B,C,D, or E, in fact your character is not found!");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("The month is " + month);
                break;
            case "february":
                System.out.println("The month is " + month);
                break;
            case "march":
                System.out.println("The month is " + month);
                break;
            case "april": case "may": case "june": case "july":
                System.out.println("The month is " + month);
                break;
            case "august": case "september": case "october": case "november": case "december":
                System.out.println("Your month is " + month);
                break;
            default:
                System.out.println("Please select a valid month!");
        }
    }
}
