
// Assignment #: Arizona State University CSE205
//         Name: Yousuf Khoori
//    StudentID: 1218037782
//      Lecture: MWF 11:50AM
//  Description: PaneWithRectangles class creates a pane where we can use
//               mouse key to drag on grids and there will be some color following
//               the mouse. We can also use combo boxes to change its colors and stroke widths

//import any classes necessary here
//----
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class PaneWithRectangles extends BorderPane
{
    private ComboBox<String> primaryColorCombo;
    private ComboBox<String> backColorCombo;
    private ComboBox<String> widthCombo;

    private Color primaryColor, secondaryColor, backgroundColor;
    private double selectWidth;

    private Rectangle[][] rectArray;

    private Label primColor, backColor, widthComb;


    public PaneWithRectangles()
    {
        primaryColor = Color.BLACK;
        secondaryColor = Color.GRAY;
        backgroundColor = Color.WHITE;
        selectWidth = 1.0;

        //Instantiate and initialize labels, combo boxes
        primaryColorCombo = new ComboBox<String>();
        primaryColorCombo.getItems().addAll("Black", "Blue", "Red", "Green");
        primaryColorCombo.setValue("Black");

        backColorCombo = new ComboBox<String>();
        backColorCombo.getItems().addAll("White", "Yellow", "Orange");
        backColorCombo.setValue("White");

        widthCombo = new ComboBox<String>();
        widthCombo.getItems().addAll("1", "3", "5", "7");
        widthCombo.setValue("1");

        primColor = new Label("PrimaryColor");
        backColor = new Label("BackgroundColor");
        widthComb = new Label("StrokeWidth");


        //Instantiate and initialize the two dimensional array rectArray
        //to contain 7 columns and 7 rows (49 rectangles total)
        //It is recommended to use nested loops

        final int WIDTH = 470/7;
        final int HEIGHT = 390/7;
        int reduction = (int) (selectWidth - 1);
        int newWidth = (int) (WIDTH - reduction);
        int newHeight = (int) (HEIGHT - reduction);

        rectArray = new Rectangle[7][7];

        for (int i = 0; i < 7; i++){

            for (int j = 0; j < 7; j++){

                rectArray[i][j] = new Rectangle(470/(i+1),390/(j+1), newWidth, newHeight);
                rectArray[i][j].setStroke(Color.BLACK);
                rectArray[i][j].setFill(backgroundColor);
                rectArray[i][j].setStrokeWidth(selectWidth);

            }

        }


        //grid is a GridPane containing 49 rectangles.
        GridPane grid = new GridPane();
        //---- add 49 rectangles to the grid pane, it is recommended to use nested loops
        //----
        //----
        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {

                grid.add(rectArray[i][j], i, j);

            }

        }

        //leftPane is a VBox, it should contain labels and combo boxes
        VBox leftPane = new VBox();
        leftPane.setSpacing(20);
        leftPane.setPadding(new Insets(10, 0, 10, 0));
        leftPane.getChildren().addAll(primColor, primaryColorCombo, backColor, backColorCombo, widthComb, widthCombo);


        //add the left pane to the left of the pane
        //and the grid pane contains rectangles at the center
        this.setLeft(leftPane);
        this.setCenter(grid);

        //register/link the source nodes with its handler objects
        PrimColorHandler pHandler = new PrimColorHandler();
        MouseHandler mHandler = new MouseHandler();

        backColorCombo.setOnAction(new BackColorHandler());
        primaryColorCombo.setOnAction(pHandler);
        widthCombo.setOnAction(new WidthHandler());
        grid.setOnMouseDragged(mHandler);
        grid.setOnMouseReleased(mHandler);

        //----
        //----
        //----

    }


    //Step #2(A) - MouseHandler
    private class MouseHandler implements EventHandler<MouseEvent>
    {
        public void handle(MouseEvent event)
        {
            //handle MouseEvent here
            //Note: you can use if(event.getEventType()== MouseEvent.MOUSE_DRAGGED)
            //to check whether the mouse key is dragged
            //write your own codes here
            //----
            if(event.getEventType() == MouseEvent.MOUSE_DRAGGED){

                for (int i = 0; i < 7; i++){
                    for (int j = 0; j < 7; j++){

                        rectArray[i][j].setStroke(Color.BLACK);
                        rectArray[i][j].setFill(backgroundColor);

                    }
                }

                final int WIDTH = 470/7;
                final int HEIGHT = 390/7;
                //which circle we need to fill
                int i = (int)event.getX()/WIDTH;
                int j = (int)event.getY()/HEIGHT;

                //fill the cArray[i] with the pickedColor
                if(i>=1 && i <=5 && j >= 1 && j <= 5)
                {
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i+1][j].setFill(secondaryColor);
                    rectArray[i-1][j].setFill(secondaryColor);
                    rectArray[i][j+1].setFill(secondaryColor);
                    rectArray[i][j-1].setFill(secondaryColor);
                } else if (i == 0 && j == 0){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i][j+1].setFill(secondaryColor);
                    rectArray[i+1][j].setFill(secondaryColor);
                } else if (i == 0 && j == 6){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i][j-1].setFill(secondaryColor);
                    rectArray[i+1][j].setFill(secondaryColor);
                } else if (i == 6 && j == 6){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i][j-1].setFill(secondaryColor);
                    rectArray[i-1][j].setFill(secondaryColor);
                } else if (i == 6 && j == 0){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i][j+1].setFill(secondaryColor);
                    rectArray[i-1][j].setFill(secondaryColor);
                } else if (i > 0 && j == 0){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i+1][j].setFill(secondaryColor);
                    rectArray[i-1][j].setFill(secondaryColor);
                    rectArray[i][j+1].setFill(secondaryColor);
                } else if (i > 0 && j == 6){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i+1][j].setFill(secondaryColor);
                    rectArray[i-1][j].setFill(secondaryColor);
                    rectArray[i][j-1].setFill(secondaryColor);
                } else if (i == 6 && j > 0 && j < 6){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i-1][j].setFill(secondaryColor);
                    rectArray[i][j-1].setFill(secondaryColor);
                    rectArray[i][j+1].setFill(secondaryColor);
                }
                else if (i == 0 && j > 0){
                    rectArray[i][j].setFill(primaryColor);
                    rectArray[i+1][j].setFill(secondaryColor);
                    rectArray[i][j-1].setFill(secondaryColor);
                    rectArray[i][j+1].setFill(secondaryColor);
                } else if(event.getEventType() == MouseEvent.MOUSE_RELEASED)
                {
                    for(int r = 0; i < rectArray.length; i++)
                    {
                        for (int c = 0; j < rectArray[r].length; j++) {

                            rectArray[i][j].setFill(backgroundColor);

                        }
                    }
                }
//

            }


        }//end handle()

    }//end MouseHandler

    //A handler class used to handle primary and secondary colors
    private class PrimColorHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            switch(primaryColorCombo.getValue()){
                case "Black":
                    primaryColor = Color.BLACK;
                    secondaryColor = Color.GRAY;
                    break;

                case "Blue":
                    primaryColor = Color.BLUE;
                    secondaryColor = Color.POWDERBLUE;
                    break;

                case "Red":
                    primaryColor = Color.RED;
                    secondaryColor = Color.PINK;
                    break;

                case "Green":
                    primaryColor = Color.GREEN;
                    secondaryColor = Color.LIGHTGREEN;
                    break;
            }
        }
    }//end PrimColorHandler

    //A handler class used to handle background color
    private class BackColorHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            //write your own codes here
            //----
            if (backColorCombo.getValue().equals("White")){
                backgroundColor = Color.WHITE;
            } else if (backColorCombo.getValue().equals("Yellow")){
                backgroundColor = Color.YELLOW;
            } else if (backColorCombo.getValue().equals("Orange")){
                backgroundColor = Color.ORANGE;
            } else {
                backgroundColor = Color.WHITE;
            }

            for (int i = 0; i < 7; i++){

                for (int j = 0; j < 7; j++){


                    rectArray[i][j].setFill(backgroundColor);

                }

            }

        }
    }//end BackColorHandler

    //A handler class used to handle stroke width
    private class WidthHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            //write your own codes here
            //----
            switch(widthCombo.getValue()){
                case "1":
                    selectWidth = 1.0;
                    break;

                case "3":
                    selectWidth = 3.0;
                    break;

                case "5":
                    selectWidth = 5.0;
                    break;

                case "7":
                    selectWidth = 7.0;
                    break;
            }

            for (int i = 0; i < 7; i++){

                for (int j = 0; j < 7; j++){

                    rectArray[i][j].setStrokeWidth(selectWidth);


                }

            }
        }
    }//end WidthHandler
} //end of PaneWithRectangles