import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;

public class JavaFXTesting extends Application{

    public void start(Stage xStage){

        Rectangle r1 = new Rectangle(100, 100, 100, 100);
        //Rectangle r2 = new Rectangle(0, 0, 100, 100);

        Pane pane = new Pane();
        pane.setMinSize(200,200);

        pane.getChildren().add(r1);
        //pane.getChildren().add(r2);

        Scene scene = new Scene(pane);
        xStage.setTitle("Testing Lmao");
        xStage.setScene(scene);
        xStage.show();
    }
}
