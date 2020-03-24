//This is the driver program used to check the
//the CircleArrayDemo.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestCircle extends Application
{
    public void start(Stage xStage)
    {
        //create an object
        CircleArrayDemo gui = new CircleArrayDemo();

        //create the scene and put gui inside
        Scene scene1 = new Scene(gui, 500, 300);
        xStage.setTitle("Mouse demo");
        xStage.setScene(scene1);
        xStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}
