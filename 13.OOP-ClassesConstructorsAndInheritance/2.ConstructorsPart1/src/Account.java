public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {//Creates a constructor for the object
        this( //When calling another constructor it must be the first call or action
                "56789",
                2.50,
                "Default name",
                "Default email",
                "Default phone"
        );
        System.out.println("Empty constructor called!");
    }
    public Account(//Overloading the above constructor
            String number,
            double balance,
            String customerName,
            String customerEmailAddress,
            String customerPhoneNumber
    ) {
        System.out.println("Account constructor with parameters called!");
        //setNumber(number);//While you can do it this way, it is best to set the fields directly
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {//Method to make a deposit
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made.  New balance is $" + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {//Method to withdraw money
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only $" + this.balance + " available for withdrawal. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed.  Remaining balance = $" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
