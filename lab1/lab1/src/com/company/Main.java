package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 1280, 720);
//////////////////////////////////////////////////////
        scene.setFill(Color.WHITE);

        Ellipse ellipse = new Ellipse(640,360, 25,100);
        ellipse.setFill(Color.LIME);

        Line leftLine = new Line(630, 300, 610, 200);
        leftLine.setStroke(Color.GREEN);

        Line rightLine = new Line(650, 300, 670, 200);
        rightLine.setStroke(Color.GREEN);

        Polygon wings = new Polygon(
            640, 360, 800, 200, 940, 300,
            640, 360, 480, 200, 340, 300,
            640, 360, 800, 520, 940, 420,
            640, 360, 480, 520, 340, 420
        );
        wings.setFill(Color.LIGHTBLUE);

        root.getChildren().addAll(
                ellipse,
                leftLine,
                rightLine,
                wings
        );
//////////////////////////////////////////////////////
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}