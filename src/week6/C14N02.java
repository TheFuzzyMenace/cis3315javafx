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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class C14N02 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Image imageX = new Image("image/x.gif");
        Image image0 = new Image("image/o.gif");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int status = (int) (Math.random() * 3);
                System.out.println("status = " + status);
                if (status == 0) {
                    pane.add(new ImageView(imageX), j, i);
                } else if (status == 1) {
                    pane.add(new ImageView(image0), j, i);

                }
            }
        }

        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("C14N02");
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
