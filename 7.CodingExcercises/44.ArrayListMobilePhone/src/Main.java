import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("(919)748-7412");

    public static void main(String[] args) {
        //create and implement the phone app menu
        boolean quit = false;

        startPhone();

        printActions();

        while(!quit) {
            System.out.println("\nEnter action:(6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down phone.......");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    //Add a contact to the contact list
    private static void addNewContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone = " + phone);
        } else {
            System.out.println("Can't add, contact already exists");
        }
    }
    //Update an existing contact
    private static void updateContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Error updating contact");
        }
    }

    //Remove a contact
    private static void removeContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Contact successfully deleted");
        } else {
            System.out.println("There was an error deleting contact");
        }
    }

    //Find a contact in the contact list
    private static void queryContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " +
                existingContactRecord.getPhoneNumber());
    }
    public static void startPhone() {
        System.out.println("Starting phone.......");
    }

    public static void printActions() {
        System.out.println("\nAvailable actions: \nSelect an option:");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a contact\n" +
                "3 - to update a contact\n" +
                "4 - to remove a contact\n" +
                "5 - to query if a contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your option: ");
    }
}
