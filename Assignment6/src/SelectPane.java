
// Assignment #: Arizona State University CSE205 #6
//         Name: Yousuf Khoori
//    StudentID: 1218037782
//      Lecture: MWF 11:50AM
//  Description: ReviewPane displays a list of available clubs
//  from which a user can select and compute their total number of members.

import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.scene.Node;

//import all other necessary javafx classes here
//----

public class SelectPane extends BorderPane
{
    private ArrayList<Club> clubList;
    private ArrayList<CheckBox> checkBoxArrayList;
    private Label topMsg, bottomMsg;
    private int totalNum;
    private VBox cbPane;

    //constructor
    public SelectPane(ArrayList<Club> list)
    {
        //initialize instance variables
        this.clubList = list;
        //clubList = new ArrayList<Club>();
        checkBoxArrayList = new ArrayList<CheckBox>();
        topMsg = new Label("Select some clubs");
        bottomMsg = new Label("The total number of members for the selected club(s): " + totalNum);

        //set up the layout
        //----
        BorderPane rootPane = new BorderPane();
        this.setTop(topMsg);
        this.setBottom(bottomMsg);


        //create an empty pane where you can add check boxes later
        //----
        cbPane = new VBox();
        cbPane.setSpacing(30);

        //SelectPane is a BorderPane - add the components here
        //----
        this.setCenter(cbPane);
        this.getChildren().add(rootPane);

    } //end of constructor

    //This method uses the newly added parameter Club object
    //to create a CheckBox and add it to a pane created in the constructor
    //Such check box needs to be linked to its handler class
    public void updateClubList(Club newClub)
    {
        SelectionHandler xHandler = new SelectionHandler();
        //-------
        CheckBox aBox = new CheckBox(newClub.toString());
        aBox.setOnAction(xHandler);
        checkBoxArrayList.add(aBox);
        cbPane.getChildren().addAll(aBox);

    }

    //create a SelectionHandler class
    private class SelectionHandler implements EventHandler<ActionEvent>
    {
        //Override the abstact method handle()
        public void handle(ActionEvent event)
        {
            //When any radio button is selected or unselected
            //the total number of members of selected clubs should be updated
            //and displayed using a label.
            totalNum = 0;



            for (int i = 0; i < checkBoxArrayList.size(); i++){

                if (checkBoxArrayList.get(i).isSelected()){

                    totalNum += clubList.get(i).getNumberOfMembers();

                }

            }

            bottomMsg.setText("The total number of members for the selected club(s): " + totalNum);

        }
    } //end of SelectHandler class
} //end of SelectPane class