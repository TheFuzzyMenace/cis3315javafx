/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Create a GUI Java FX application that given the weight of a person on Earth
 * then calculate the weight of the person on the Moon, Venus, Mars, and
 * Jupiter. display the calculated weights with two decimal places and make the
 * calculated text field values cannot be edited.
 *
 * @author Administrator
 */
public class WeightOnPlanet extends Application {

    private static final double GRAVITY_MOON = 0.17;
    private static final double GRAVITY_VENUS = 0.91;
    private static final double GRAVITY_MARS = 0.38;
    private static final double GRAVITY_JUPITER = 2.54;

    private TextField tfEarth, tfMoon, tfVenus, tfMars, tfJupiter;

    //TextField will display the weight on different planets
    @Override
    public void start(Stage primaryStage) {

        Label lbTitle = new Label("How Much Do I Weigh?");
        lbTitle.setStyle("-fx-font-size: 24pt; -fx-text-fill: #ff0000;");
        HBox hBoxTitle = new HBox();
        hBoxTitle.setAlignment(Pos.CENTER);
        hBoxTitle.getChildren().add(lbTitle);

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-hgap: 10; -fx-vgap: 10; -fx-padding: 20; -fx-alignment: center;");

        Label lbEarth = new Label();
        lbEarth.setStyle("-fx-font-size: 18pt; -fx-text-fill: #000000;");
        lbEarth.setText("Earth Weight: ");
        gridPane.add(lbEarth, 0, 0);//what to add, what column, what row

        tfEarth = new TextField();
        tfEarth.setPromptText("Enter Your Weight Here");
        tfEarth.setFocusTraversable(false);
        gridPane.add(tfEarth, 1, 0);

        Label lbMoon = new Label();
        lbMoon.setStyle("-fx-font-size: 18pt;-fx-text-fill: #0000ff;");
        lbMoon.setText("Moon Weight: ");
        gridPane.add(lbMoon, 0, 1);//what to add, what column, what row

        tfMoon = new TextField();
        tfMoon.setEditable(false); //this means they can only view the text.. not change it
        gridPane.add(tfMoon, 1, 1);

        Label lbVenus = new Label();
        lbVenus.setStyle("-fx-font-size: 18pt;-fx-text-fill: #0000ff;");
        lbVenus.setText("Venus Weight: ");
        gridPane.add(lbVenus, 0, 2);

        tfVenus = new TextField();
        tfVenus.setEditable(false);
        gridPane.add(tfVenus, 1, 2);

        Label lbMars = new Label();
        lbMars.setStyle("-fx-font-size: 18pt;-fx-text-fill: #0000ff;");
        lbMars.setText("Mars Weight: ");
        gridPane.add(lbMars, 0, 3);

        tfMars = new TextField();
        tfMars.setEditable(false);
        gridPane.add(tfMars, 1, 3);

        Label lbJupiter = new Label();
        lbJupiter.setStyle("-fx-font-size: 18pt;-fx-text-fill: #0000ff;");
        lbJupiter.setText("Jupiter Weight: ");
        gridPane.add(lbJupiter, 0, 4);

        tfJupiter = new TextField();
        tfJupiter.setEditable(false);
        gridPane.add(tfJupiter, 1, 4);

        Button btn = new Button();
        btn.setText("Calculate");
        btn.setStyle("-fx-font-size: 10pt; -fx-padding: 10; -fx-text-fill: #ff0000;-fx-background-color: #515966;");
        btn.setOnAction(e -> calculate());

        HBox hBoxButton = new HBox(10);
        hBoxButton.setAlignment(Pos.CENTER);
        hBoxButton.getChildren().add(btn);

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-padding: 20;-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #e5e4e3, #9b948d)");
        borderPane.setTop(hBoxTitle);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(btn);

        Scene scene = new Scene(borderPane);

        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void calculate() {
        double weight = Double.parseDouble(tfEarth.getText()); //gets earht weight and converst it to double

        double moonWeight = weight * GRAVITY_MOON;
        tfMoon.setText(String.format("%.2f", moonWeight));

        double venusWeight = weight * GRAVITY_VENUS;
        tfVenus.setText(String.format("%.2f", venusWeight));

        double marsWeight = weight * GRAVITY_MARS;
        tfMars.setText(String.format("%.2f", marsWeight));

        double jupiterWeight = weight * GRAVITY_JUPITER;
        tfJupiter.setText(String.format("%.2f", jupiterWeight));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}