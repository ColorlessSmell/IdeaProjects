//Driver used to check GUI

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

public class GUIDemo extends Application{

    public void start(Stage primaryStage) {

        //Create an object
        Main obj = new Main();

        //Create the scene
        Scene scene = new Scene(Main, 500, 300);

        primaryStage.setTitle("GUI Demo");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
