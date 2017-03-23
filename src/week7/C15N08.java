/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class C15N08 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(); //can wrie text with this text object
        pane.getChildren().add(text);
        
        pane.setOnMousePressed(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText(e.getX() + ", " + e.getY());
            
        
        });
        
        Scene scene = new Scene(pane, 500, 500);
        
        primaryStage.setTitle("Example of how to display coordinates of a Pane when clicked (measured in pixels)");
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
