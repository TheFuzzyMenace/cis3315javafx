/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class C15N02 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle rect = new Rectangle(200,200,200,150);
       
        rect.setFill(Color.BLUE);
        pane.getChildren().add(rect);
        
        Button lbt = new Button("Rotate Left");
        lbt.setLayoutX(225);
        lbt.setLayoutY(550);
        lbt.setOnAction(e -> rect.setRotate(rect.getRotate() -15));
        pane.getChildren().add(lbt);
        
        Button rbt = new Button("Rotate Right");
        rbt.setLayoutX(325);
        rbt.setLayoutY(550);
        rbt.setOnAction(e -> rect.setRotate(rect.getRotate() + 15));
        pane.getChildren().add(rbt);
        

        
        
    
        Scene scene = new Scene(pane, 600, 600);
        
        primaryStage.setTitle("Hello World!");
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
