# JavaFX Challenge
For this challenge, you'll create a simple contacts application that has a single main window.  The Application
will allow the user to add a contact, edit a contact, and delete a contact.   You'll display the contacts using
the TableView control.

While we didn't cover TableView in the lectures, we learned everything we need to know to use one.

There will be a single Contacts menu that contains Add, Edit, and Delete items.
You will want to be able to load and store the contacts, which isn't a part of JavaFX topic.
There is a quick and dirty ContactData class that contains a way to load and store the contacts using XML.

You don't have to understand the code.  Don't change it.  Also, it doesn't do any verification, so when we add
and edit a contact, all the values must be provided for the code to work.  If we leae a value out, the code will
throw an exception when we try to read the values into the application. 

You'll have to add code to the ContactData class to complete the challenge.  There are comments that indicate where
your code should go. 

Hints: 
1.  In addition to the ContactData class you will also need a Contact class to store the individual contacts.  For each contact
you will store the first name, last name, phone number and notes.
2.To get data binding to work with the TabelView, you will want to store the contact information as SimpleStringProperty fields.
3.The TodoList application done in an earlier lecture, covers 90% of what will be needed to complete this challenge. 

The instructor neglects to mention quite a few details in all of these lectures which kind of leaves the students 
hanging.  Not just in challenges but throughout the course itself. 