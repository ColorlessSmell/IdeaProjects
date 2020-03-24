//This program demonstrate MouseEvent on
//a 1D array of Circle objects
//see driver program TestCircle.java also

import javafx.scene.control.ComboBox;
import javafx.scene.shape.Circle;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class CircleArrayDemo extends BorderPane
{
    //instance variables
    private ComboBox<String> cb;
    private Pane canvas;
    private Circle[] cArray;
    private Color pickedColor;
    private final int RADIUS = 40;

    public CircleArrayDemo()
    {
        //Step #1
        cb = new ComboBox<String>();
        cb.getItems().addAll("Red", "Green", "Blue", "Yellow");
        cb.setValue("Red");
        canvas = new Pane();
        pickedColor = Color.RED;

        cArray = new Circle[6];
        for(int i = 0; i < cArray.length; i++)
        {
            cArray[i] = new Circle(RADIUS+2*RADIUS*i, 60, RADIUS);
            cArray[i].setStroke(Color.BLACK);
            cArray[i].setFill(Color.WHITE);
            canvas.getChildren().add(cArray[i]);
        }

        //set up the layout
        this.setTop(cb);
        this.setCenter(canvas);

        //Step #3: register the ComboBox with its handler
        cb.setOnAction(new ColorHandler());

        //register the canvas with Mouse handler
        canvas.setOnMouseReleased(new MouseHandler());
        canvas.setOnMouseDragged(new MouseHandler() );
    }

    //Step #2: ComboBox event handler
    private class ColorHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            if(cb.getValue().equals("Red"))
                pickedColor = Color.RED;
            else if (cb.getValue().equals("Green"))
                pickedColor = Color.GREEN;
            else if (cb.getValue().equals("Blue"))
                pickedColor = Color.BLUE;
            else
                pickedColor = Color.YELLOW;
        }

    }

    //Step #2: MouseEvent handler
    private class MouseHandler implements EventHandler<MouseEvent>
    {
        public void handle(MouseEvent e)
        {
            if(e.getEventType() == MouseEvent.MOUSE_DRAGGED)
            {
                //re-initialize all Circles
                for(int i = 0; i < cArray.length; i++)
                {
                    cArray[i].setStroke(Color.BLACK);
                    cArray[i].setFill(Color.WHITE);
                }
                //which circle we need to filk
                int i = (int)e.getX()/(2*RADIUS);

                //fill the cArray[i] with the pickedColor
                if(i>=0 && i <=4)
                {
                    cArray[i].setFill(pickedColor);
                    cArray[i+1].setFill(Color.YELLOW);
                }
                if (i == 5)
                    cArray[i].setFill(pickedColor);
                else{ }

            }
            else if(e.getEventType() == MouseEvent.MOUSE_RELEASED)
            {
                for(int i = 0; i < cArray.length; i++)
                {
                    cArray[i].setStroke(Color.BLACK);
                    cArray[i].setFill(Color.WHITE);
                }
            }
            else
            {
            }
        }
    }
}