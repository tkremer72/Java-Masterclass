
public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Austrailia Bank");

        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created!");
        };
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sidney");
        bank.addCustomer("Sidney", "Inky", 99.00);
        bank.addCustomer("Sidney", "Binky", 9.00);
        bank.addCustomer("Sidney", "Von-Stinky", 43);

        bank.addBranch("Ooombandaka");
        bank.addCustomer("Ooombandaka", "Wing-Wing", 9999999999.0);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.33);
        bank.addCustomerTransaction("Adelaide", "Mike", 4.33);
        bank.addCustomerTransaction("Adelaide", "Percy", 33);
        bank.addCustomerTransaction("Adelaide", "Mike", 4);

        bank.listCustomers("Adelaide", false);
        System.out.println("**********************************");
        bank.listCustomers("Sidney", true);
        System.out.println("**********************************");
        bank.listCustomers("Ooombandaka", true);

        //Try to send invalid data
        bank.addBranch("Melbourne"); //This should prevent below from throwing an error
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist!");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists!");
        }
        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 999.00)) {
            System.out.println("Customer does not exist at this branch!");
        }
        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists!");
        }
        
    }
}
