import java.util.ArrayList;

public class Branch {
    //Create the fields
    private String name;
    private ArrayList<Customer> customers;

    //Create a constructor to initialize fields
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    //Create the getters

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //method to add a new customer
    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    //Add a customer transaction
    public boolean addCustomerTransaction(String customerName, double amount) {
       Customer existingCustomer = findCustomer(customerName);
       if(existingCustomer != null) {
           existingCustomer.addTransaction(amount);
           return true;
       }
        return false;
    }
    //Method to find the customer if the customer exists
    private Customer findCustomer(String customerName) {
        for(int i = 0; i < customers.size(); i++) {
            Customer foundCustomer = this.customers.get(i);
            if(foundCustomer.getName().equals(customerName)) {
                return foundCustomer;
            }
        }
        return null;

    }
}
