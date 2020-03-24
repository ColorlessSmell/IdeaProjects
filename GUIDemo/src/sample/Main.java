package sample;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.beans.EventHandler;

//GUI Components should be declared as instance variable
private Label lab1, lab2, lab3;
private TextField tf1, tf2, tf3;
private Button sumBtn;
private TextArea ta;

public class Main extends Application {

    ta = new TextAre("Initial texts here");
    lab1 = new Label("Num1");
    lab2 = new Label("Num2");
    lab3 = new Label("Num3");

    tf1 = new TextField();
    tf2 = new TextField();
    tf3 = new TextField();

    GridPane topPane = new GridPane();
    topPane.add(lab1, 0, 0);
    topPane.add(tf1, 1, 0);

    topPane.add(lab2, 0, 1);
    topPane.add(tf2, 1, 1);

    topPane.add(lab3, 0, 2);
    topPane.add(tf3, 1, 2);

    //Bottom pane
    FlowPane bottomPane = new FlowPane();
    bottomPane.getChildren().add(sumBtn);

    //Now finish the leftPane
    BorderPane leftPane = new BorderPane();
    leftPane.setCenter(topPane);
    leftPane.setBottom(bottomPane);

    this.getChildren().addAll(leftPane, ta);

    //Step #3 registration(Set a relationship between source and handler objects): sourceObj.setOnAction(handlerObj)
    ButtonHandler xHandler = new ButtonHandler();
    sumBtn.setOnAction(xHandler);


    }//end of constructor

    //step #2: private inner class that is the handler class
    private class ButtonHandler implements EventHandler<ActionEvent>{

    public void handle(ActionEvent event){

        //Define what you will do when clicking on the button
        String numString = tf1.getText();
        double num1 = Double.parseDouble(numString);

        double num2 = Double.parseDouble(tf2.getText());
        double sum = num1 + num2;
        String result = sum + "";
        tf3.setText(result);

        ta.appendText("\n" + result);

    }

    }


    public static void main(String[] args) {
        launch(args);

}
