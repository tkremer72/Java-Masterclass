package com.webtek.java.master_class._todo_list;

import com.webtek.java.master_class._todo_list.datamodel.TodoItem;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card.", "Buy a birthday card for someone.",
                LocalDate.of(2021, Month.JUNE, 18));
        TodoItem item2 = new TodoItem("Get Mail.", "Go to the mailbox and get the local mail.",
                LocalDate.of(2021, Month.JUNE, 19));
        TodoItem item3 = new TodoItem("Purchase Grocery.", "Go online and purchase groceries for supper.",
                LocalDate.of(2021, Month.JUNE, 19));
        TodoItem item4 = new TodoItem("Take Shot.", "Perform Stelara injection every two months on the 24th.",
                LocalDate.of(2021, Month.JUNE, 24));
        TodoItem item5 = new TodoItem("Walk Dogs.", "Take the dogs to the dog park for a daily walk.",
                LocalDate.of(2021, Month.MARCH, 23));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("The selected item is " + item);
        StringBuilder dueDate = new StringBuilder(item.getDetails());
        dueDate.append("\n\n\n\n");
        dueDate.append("Due: ");
        dueDate.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(dueDate.toString());
        
    }
}
