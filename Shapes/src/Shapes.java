//This program demonstrates various shapes and their properties
//Line, Rectangle, Circle, Ellipse, Arc

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;

import javafx.scene.layout.Pane;

public class Shapes extends Application {

    public void start(Stage primaryStage){

        //#1: Line
        //constructor: Line(startX, startY, endX, endY);
//        Line line1 = new Line(20, 30, 180, 200); //Can also be double values
//        line1.setStroke(Color.BLUE);
//        line1.setStrokeWidth(2);
          Pane rootPane = new Pane();

//        line1.setStartX(100);
//        line1.setStartY(line1.getStartX() + 50);
//        line1.setEndY(line1.getEndY() + 50);

        //#2: Rectangle(x, y, width, height)
        Rectangle r1 = new Rectangle(50,60,100,80);
//        r1.setStroke(Color.BLACK);
//        r1.setStrokeWidth(3);
//        r1.setFill(Color.DARKRED);
//        r1.setWidth(r1.getWidth() + 50);
//        r1.setHeight(r1.getHeight() + 50);

        //#3: Circle(centerX, centerY, radius)
       Circle c1 = new Circle(150, 130,80);
//        c1.setFill(Color.RED);
//        c1.setStroke(Color.BLACK);
//        c1.setStrokeWidth(4);
//        c1.setCenterX(c1.getCenterX() + 90);

        //#4: Ellipse(centerX, centerY, radiusX, radiusY)
        //Ellipse e1 = new Ellipse(120, 140, 100, 80);
        //Here you can do same attributes as circle (setFill, setStroke, etc...)
        //e1.setRotate(45); // here positive number x rotates it clockwise x degrees

        //#5: Arc(centerX, centerY, radiusX, radiusY, startAngle, length)
        // an arc is just part of an ellipse, check photos in phone to understand
        Arc arc1 = new Arc(200,160,100,80,0,90);
        Arc arc2 = new Arc(200,160,100,80,0,90);
        Arc arc3 = new Arc(180,100,100,80,0,90);
        Arc arc4 = new Arc(180,500,100,80,0,90);
        arc1.setStroke(Color.BLACK);
        arc1.setStrokeWidth(3);
        arc1.setFill(Color.RED);
        //arc1.setType(ArcType.CHORD);
        arc1.setType(ArcType.ROUND);
        arc2.setType(ArcType.ROUND);
        arc3.setType(ArcType.ROUND);
        //arc1.setType(ArcType.OPEN);


        //add shape inside root pane
        rootPane.getChildren().addAll(arc1, arc2);
        rootPane.setPrefSize(500, 300);

        Scene scene = new Scene(rootPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shapes Demo");
        primaryStage.show();

    }

}
