import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();//Equivilant of a for loop
        while(i.hasNext()) {//while there is another element show it
            //hasNext means as long as there is another element in the list
            System.out.println("Now visiting " + i.next());//.next means go to the next element in the list
        }
        System.out.println("*************************");
    }
    //sort the list in alphabetical order below
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();//must call .next below in order to point to the first item in the list

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);//this gives us a number
            if(comparison == 0) {
                //equal do not add
                System.out.println(newCity + " is already included as a destination!");
                return false;
            } else if(comparison > 0) {
                //new city should appear before this one
                stringListIterator.previous();//because .next is used above, it has to go back to the previous city to add it
                stringListIterator.add(newCity);//adds previous city
                return true;
            } else if(comparison < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Holiday(Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {//we need these checks because we never actually land on the item, we land between items.
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the beginning of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions:\nPress ");
        System.out.println("0 - to quit\n" +
                           "1 - go to next city\n" +
                           "2 - go to previous city\n" +
                           "0 - print menu options");
    }
}
