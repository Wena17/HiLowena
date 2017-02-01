/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp.hilo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author andwh
 */
public class HiLo extends Application {

    private StackPane root;

    public static void main(String[] args) {
        launch();
    }
    private Image bgImage;

    @Override
    public void start(Stage primaryStage) {
        root = new StackPane();
        addBackground();
        primaryStage.setTitle("HiLo Game");
        primaryStage.setScene(new Scene(root, bgImage.getWidth(), bgImage.getHeight()));
        primaryStage.show();
    }

    private void addBackground() {
        bgImage = new Image("/image/a.jpg");
        ImageView bgView = new ImageView(bgImage);
        root.getChildren().add(bgView);
    }

}
