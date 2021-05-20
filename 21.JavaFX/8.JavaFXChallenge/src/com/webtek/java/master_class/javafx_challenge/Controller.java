package com.webtek.java.master_class.javafx_challenge;

import com.webtek.java.master_class.javafx_challenge.datamodel.Contact;
import com.webtek.java.master_class.javafx_challenge.datamodel.ContactData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private BorderPane mainPanel;
    @FXML
    private TableView<Contact> contactsTable;

    //add an instance of the ContactData class
    private ContactData data;

    //initialize the app controller
    public void initialize() {
        data = new ContactData();
        data.loadContacts();
        contactsTable.setItems(data.getContacts());
    }

    //Method to open the dialog
        @FXML
    public void showNewContactDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();//Create an instance of the dialog pane
        dialog.initOwner(mainPanel.getScene().getWindow());//Assign the main window as the parent of the dialog
        dialog.setTitle("Add New Contact");//Set the dialog title
            FXMLLoader fxmlLoader = new FXMLLoader();//load the fxml
            fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));
            try {
                dialog.getDialogPane().setContent(fxmlLoader.load());//set the content
            } catch(IOException e) {
                System.out.println("Could Not Load The Dialog!");
                e.printStackTrace();
                return;
            }

            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);//add ok and cancel buttons
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();//open the dialog
            if(result.isPresent() && result.get() == ButtonType.OK) {//check when user presses ok or cancel
                ContactController contactController = fxmlLoader.getController();
                Contact newContact = contactController.getNewContact();
                data.addContact(newContact);
                data.saveContacts();
            }
        }

        //Edit a contact from the contacts list
    @FXML
    public void showEditContactDialog() {
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();//get the selected item
        if(selectedContact == null) {//if selected item is null then do the following
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Contact Selected!");
            alert.setHeaderText(null);
            alert.setContentText("Please select the contact you wish to edit.");
            alert.showAndWait();
            return;
        }

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Edit Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch(IOException e) {
            System.out.println("Could not load the dialog.");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        ContactController contactController = fxmlLoader.getController();
        contactController.editContact(selectedContact);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            contactController.updateContact(selectedContact);
            data.saveContacts();
        }
    }

    @FXML
    public void deleteContact() {
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();
        if(selectedContact == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Contact Selected!");
            alert.setHeaderText(null);
            alert.setContentText("Please select the contact you want to delete.");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Contact?");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to delete " + selectedContact.getFirstName() +
                " " + selectedContact.getLastName() + " from the contact list?");

        Optional<ButtonType> result = alert.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            data.deleteContact(selectedContact);
            data.saveContacts();
        }
    }

}
