package com.webtek.java.master_class.javafx_challenge;

import com.webtek.java.master_class.javafx_challenge.datamodel.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ContactController {

        @FXML
        private TextField firstNameField;
        @FXML
        private TextField lastNameField;
        @FXML
        private TextField phoneNumberField;
        @FXML
        private TextField notesField;

        //Get the user input
        public Contact getNewContact() {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String phoneNumber = phoneNumberField.getText();
            String notes = notesField.getText();

            Contact newContact = new Contact(firstName, lastName, phoneNumber, notes);
            return newContact;
        }

        //Edit a contact
    public void editContact(Contact contact) {
            firstNameField.setText(contact.getFirstName());
            lastNameField.setText(contact.getLastName());
            phoneNumberField.setText(contact.getPhoneNumber());
            notesField.setText(contact.getNotes());
    }
    public void updateContact(Contact contact) {
            contact.setFirstName(firstNameField.getText());
            contact.setLastName(lastNameField.getText());
            contact.setPhoneNumber(phoneNumberField.getText());
            contact.setNotes(notesField.getText());
    }
}
