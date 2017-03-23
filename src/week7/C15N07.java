
package week7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class C15N07 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
   
        StackPane root = new StackPane();
        Circle circle = new Circle(50,50,40);
        root.getChildren().add(circle);
        circle.setFill(Color.AQUAMARINE);
        circle.setStroke(Color.BLACK);
        
        circle.setOnMousePressed(e -> circle.setFill(Color.BLUE));
        circle.setOnMouseReleased(e -> circle.setFill(Color.AQUAMARINE));
             
        
        Scene scene = new Scene(root, 500, 250);
        
        primaryStage.setTitle("Example of events (e) when mouse clicked and released.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
