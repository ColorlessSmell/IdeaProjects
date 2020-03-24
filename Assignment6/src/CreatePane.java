
// Assignment #: Arizona State University CSE205 #6
//         Name: Yousuf Khoori
//    StudentID: 1218037782
//      Lecture: MWF 11:50AM
//  Description: CreatePane generates a pane where a user can enter
//  a club information and create a list of available clubs.

import java.util.ArrayList;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;

import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import

//import all other necessary javafx classes here
//----



public class CreatePane extends HBox
{
    ArrayList<Club> clubList;

    //The relationship between CreatePane and SelectPane is Aggregation
    private SelectPane selectPane;
    private Label title, members, uni, errorMsg;
    private TextField tf1, tf2, tf3;
    private TextArea displayText;
    private Button create;
    public String parseString = "";
    public Club aClub;

    //constructor
    public CreatePane(ArrayList<Club> list, SelectPane sePane)
    {
        this.clubList = list;
        this.selectPane = sePane;

        //initialize each instance variable (textfields, labels, textarea, button, etc.)
        //and set up the layout
        //----
        title = new Label("Title");
        members = new Label("Number of members");
        uni = new Label("University");
        errorMsg = new Label("");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        displayText = new TextArea("No Club");
        create = new Button("Create a Club");
        errorMsg.setTextFill(Color.RED);

        //create a GridPane hold those labels & text fields.
        //you can choose to use .setPadding() or setHgap(), setVgap()
        //to control the spacing and gap, etc.
        //----
        GridPane gridPane = new GridPane();
        gridPane.setVgap(15);
        gridPane.setHgap(20);
        gridPane.setPadding(new Insets(20));

        //Set up the layout for the left half of the CreatePane.
        //----
        gridPane.add(errorMsg, 0, 0);
        gridPane.add(title, 0, 1);
        gridPane.add(tf1, 1, 1);
        gridPane.add(members, 0, 2);
        gridPane.add(tf2, 1, 2);
        gridPane.add(uni, 0, 3);
        gridPane.add(tf3, 1, 3);
        gridPane.add(create, 1, 4);

        //the right half of the CreatePane is simply a TextArea object
        //Note: a ScrollPane will be added to it automatically when there are no
        //enough space

        //Add the left half and right half to the CreatePane
        //Note: CreatePane extends from HBox
        //----
        HBox finalForm = new HBox();
        finalForm.setSpacing(20);
        finalForm.setMinSize(100,100);
        finalForm.getChildren().addAll(gridPane, displayText);

        this.getChildren().add(finalForm);
        //register/link source object with event handler
        //----
        ButtonHandler xHandler = new ButtonHandler();
        create.setOnAction(xHandler);

    } //end of constructor

    //Create a ButtonHandler class
    //ButtonHandler listens to see if the button "Create" is pushed or not,
    //When the event occurs, it get a club's Title, its number of members, and its university
    //information from the relevant text fields, then create a new club and add it inside
    //the clubList. Meanwhile it will display the club's information inside the text area.
    //using the toString method of the Club class.
    //It also does error checking in case any of the textfields are empty,
    //or a non-numeric value was entered for its number of members
    private class ButtonHandler implements EventHandler<ActionEvent>
    {
        //Override the abstact method handle()
        public void handle(ActionEvent event)
        {
            //declare any necessary local variables here
            //---
            String tf1Text = tf1.getText();
            String tf2Text = tf2.getText();
            String tf3Text = tf3.getText();
            int result = 0;
            boolean check4Num = true;

            //when a text field is empty and the button is pushed
            //if ( //----  )
            //{
            //handle the case here
            for (int i = 0; i < clubList.size(); i++){

                if (tf1Text.equals(clubList.get(i).getClubName()) && tf3Text.equals(clubList.get(i).getUniversity())){

                    result = 1;

                }
            }

            try {
                int anInt = Integer.parseInt(tf2Text);
                check4Num = true;
            } catch (NumberFormatException e){
                check4Num = false;
            }

            if (result == 1){
                errorMsg.setText("Club not added - duplicate");
            }
            else if (tf1Text.equals("") || tf2Text.equals("") || tf3Text.equals("")){
                errorMsg.setText("Please fill all fields");
            } else if (check4Num == false) {
                errorMsg.setText("Please enter an integer for number of members");
            }
            else {
                int anInt = Integer.parseInt(tf2Text);
                parseString = parseString + "Club Name:\t\t" +  tf1Text + "\n"
                        + "Number of Members:\t\t" + anInt + "\n"
                        + "University:\t\t" + tf3Text + "\n\n";
                aClub = new Club(tf1Text, anInt, tf3Text);
                clubList.add(aClub);
                errorMsg.setText("Club added");
                selectPane.updateClubList(aClub);
            }
            displayText.setText(parseString);

            //}
            //else	//for all other cases
            //{
            //when a non-numeric value was entered for its number of members
            //and the button is pushed
            //you will need to use try & catch block to catch
            //the NumberFormatException
            //----

            //When a club of an existing club name in the list
            //was attempted to be added, do not add it to the list
            //and display a message "Club not added - duplicate"



            //at the end, don't forget to update the new arrayList
            //information on the SelectPanel
            //----

            //}

        } //end of handle() method
    } //end of ButtonHandler class\

}