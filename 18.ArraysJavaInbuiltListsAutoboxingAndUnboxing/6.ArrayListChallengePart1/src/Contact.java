public class Contact {
    //Create two fields for our contacts, name and phone number
    private String name;
    private String phoneNumber;
    //Create a constructor and initialize the two fields
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //Create two getters for our fields.
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //Expose a public static method for creating a contact
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);//this method calls the constructor to create a new contact record
    }
}
