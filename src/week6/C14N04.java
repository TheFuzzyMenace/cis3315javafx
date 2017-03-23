/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class C14N04 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       HBox pane = new HBox();
       pane.setAlignment(Pos.CENTER);
                                                                                     // this is the Font size
       Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 36);//<<<<
       for(int i = 0; i < 5; i++){
           Text txt = new Text("Jeremiah");
           txt.setRotate(i * 30);// i * 30.. that will rotate the text a bit every pass.
           txt.setFont(font);
 
           pane.getChildren().add(txt);
                                //Red             Green        Blue       Transparency
           txt.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
       }
        
        Scene scene = new Scene(pane, 900, 250);
        
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
