public class Main {
    public static void main(String[] args) {
        Account thomasAccount = new Account(
                "053924317094",
                9999.99,
                "Thomas E. Kremer",
                "tkremer@nc.rr.com",
                "(919)748-7412");
//        thomasAccount.setNumber("053924317094");
//        thomasAccount.setBalance(9999);
//        thomasAccount.setCustomerName("Thomas E. Kremer");
//        thomasAccount.setCustomerEmailAddress("tkremer@nc.rr.com");
//        thomasAccount.setCustomerPhoneNumber("(919)748-7412");
        System.out.println("Account#: " + thomasAccount.getNumber());
        System.out.println("Customer Name: " + thomasAccount.getCustomerName());
        System.out.println("Customer Email: " + thomasAccount.getCustomerEmailAddress());
        System.out.println("Customer Phone#: " + thomasAccount.getCustomerPhoneNumber());
        System.out.println("Funds Available: $" + thomasAccount.getBalance());
        thomasAccount.withdrawal(100.0);

        thomasAccount.deposit(50.0);
        thomasAccount.withdrawal(100.0);

        thomasAccount.deposit(51.0);
        thomasAccount.withdrawal(100.0);
        System.out.println("*******************************");
        Account defaultAccount = new Account();

        System.out.println("Account#: " + defaultAccount.getNumber());
        System.out.println("Customer Name: " + defaultAccount.getCustomerName());
        System.out.println("Customer Email: " + defaultAccount.getCustomerEmailAddress());
        System.out.println("Customer Phone#: " + defaultAccount.getCustomerPhoneNumber());
        System.out.println("Funds Available: $" + defaultAccount.getBalance());
        defaultAccount.withdrawal(100.0);

        defaultAccount.deposit(50.0);
        defaultAccount.withdrawal(100.0);

        defaultAccount.deposit(51.0);
        defaultAccount.withdrawal(100.0);
    }
}
