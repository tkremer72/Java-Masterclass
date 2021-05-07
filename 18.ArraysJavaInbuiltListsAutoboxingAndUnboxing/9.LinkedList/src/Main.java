import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;//assigning the second customer class to point to the first one
        anotherCustomer.setBalance(12.18);//Sets the first balance to 12.18
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);//inserts the element 2 in index position 1
        System.out.println("*************************");
        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
