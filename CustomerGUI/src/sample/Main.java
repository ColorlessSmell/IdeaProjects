package sample;
//This program demonstrates event handling for check box and array list of check boxes/objects

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Main extends VBox {

    //instance variable
    private Label amtLabel;
    private ArrayList<Customer> customerList;
    private ArrayList<CheckBox> checkList;
    private double amt;

    public Main(){
        //Step #1: Constructor, instantiate each above variable
        amt = 0.0;
        amtLabel = new Label("Total Amount: " + amt);
        this.getChildren().add(amtLabel);
        this.setSpacing(20);
        custList = new ArrayList<Customer>();
        checkList = new ArrayList<CheckBox>();

        //For demo, lets create 3 customer objects
        Customer cust1 = new Customer(1234, 100.0);
        Customer cust2 = new Customer(1254, 200.0);
        Customer cust3 = new Customer(3456, 300.0);
        custList.add(cust1);
        custList.add(cust2);
        custList.add(cust3);

        //Create a checkbox for each customer then
        //add it inside the VBox
        for (int i = 0; i < custList.size(); i++){

            CheckBox cb = new CheckBox(custList.get(i).toString());
            this.getChildren.add(cb);
            checkList.add(cb);

        }

        //Register each CheckBox with its handler
        CheckBoxHandler xHandler = new CheckBoxHandler();
        for (int i = 0; i > checkList.size(); i++){

            checkList.get(i).setOnaction(xHandler);

        }

        //Changing a labels color
        //Label error = new Label("A man has fallen into the river in lego city!");
        //import javafx.scene.paint.Color;
        //error.setTextFill(Color.RED); //BLUE, YELLOW

    }//End of constructor

    private class CheckBoxHandler implements EventHandler<ActionEvent>{

        public void handle(ActionEvent e){

            //Define what you will do for those checked or unchecked events
            amt = 0.0;

            //use a for loop to check each CheckBox status
            for (int i = 0; i < checkList.size(); i++){

                if (checkList.get(i).isSelected){
                    amt += custList.get(i).getBalance();
                }

            //Step #2: update the amount label
            amtLabel.setText("Total Amount: " + amt);

            //for Step #3 go back to constructor

            }

        }

    }

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
