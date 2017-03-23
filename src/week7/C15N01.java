/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class C15N01 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= 52; i++) {
            list.add(i);
        }

        //shuffles the "cards"
        java.util.Collections.shuffle(list);

        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);
        for (int i = 0; i <= 5; i++) {
            hBox.getChildren().add(new ImageView("image/card/" + list.get(i) + ".png"));//use this to actually get the cards
        }

        Button btRefresh = new Button("Refresh"); // new button named "Refresh"

        //this is a "listener".. makes the button actually DO something.
        btRefresh.setOnAction(e -> {
            //this shuffles and deals a "new hand".
            java.util.Collections.shuffle(list);
            hBox.getChildren().clear(); //clear hand so it doesn't just add on to the old hBox
            for (int i = 0; i <= 5; i++) {
                hBox.getChildren().add(new ImageView("image/card/" + list.get(i) + ".png"));//use this to actually get the cards
            }
        });

        HBox hBoxBtn = new HBox();
        hBoxBtn.getChildren().add(btRefresh);
        BorderPane pane = new BorderPane();
        pane.setCenter(hBox); //cards int he center
        pane.setBottom(btRefresh); //button placed on the bottom
        BorderPane.setAlignment(btRefresh, Pos.CENTER);


        StackPane root = new StackPane();

        Scene scene = new Scene(pane, 500, 350);

        primaryStage.setTitle("Cards!");
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
