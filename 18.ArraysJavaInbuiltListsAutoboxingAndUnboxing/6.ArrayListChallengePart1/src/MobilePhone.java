import java.util.ArrayList;

public class MobilePhone {
    //Create an option to store the mobile phone number
    private String myNumber;

    //Create the ArrayList
    private ArrayList<Contact> myContacts;

    //Create a constructor that accepts myNumber
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        //Initialize the ArrayList with an empty list
        this.myContacts = new ArrayList<Contact>();
    }

    //Create the methods for MobilePhone, with addContact
    public boolean addNewContact(Contact contact) {//Sending a contact object
        if(findContact(contact.getName()) >= 0) {//checking if the contact exists
            System.out.println("Contact is already on file!");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact has been added successfully!");
        return true;
    }
    //Create a method to update the contact list.

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {//Check to see if contact exists
            System.out.println(oldContact.getName() + ", was not found.");//if it doesn't do this
            return false;
            } else if(findContact(newContact.getName()) != -1) {//if contact information is the same, don't update
            System.out.println("Contact with name " + newContact.getName() +
                     " already exists, update not successful!");
            return false;
            }
        //if contact exists then do below
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    //Create a method to remove a contact from the list
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found!");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    //create and implement an overload a find contact method one for use within this class
    //only and one for use within this app globally
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);//returns the position number of the element in the array
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {//Loop through the array of contacts
            Contact contact = this.myContacts.get(i);//if the contact is in the list, retrieve the position
            if(contact.getName().equals(contactName)) { //if the name of the contact in the position is the same
                return i;//return the contact
            }
        }
        return -1; //if contact isn't found, return invalid
    }

    //Create a public method to return the data from the private methods above as a string to the app
    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }
    //find a contact position number based on the name
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    //Create a public method to print the contacts
    public void printContacts() {
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

}
