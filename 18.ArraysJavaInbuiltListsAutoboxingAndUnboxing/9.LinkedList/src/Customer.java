public class Customer {
    //Fields
    private String name;
    private double balance;
    //Constructor that initializes fields
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }
    //Getter
    public double getBalance() {
        return balance;
    }
    //Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
