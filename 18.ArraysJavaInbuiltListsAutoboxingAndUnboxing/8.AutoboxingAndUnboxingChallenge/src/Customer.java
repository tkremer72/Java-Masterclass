import java.util.ArrayList;

public class Customer {
    //Create the fields for customer
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        //initialize the transactions
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    //Mechanism to add transactions
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    //Create the getters

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


}
