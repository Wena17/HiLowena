/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp.hilo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
    private Image cardBack;
    private ImageView[] cv = new ImageView[2];
    private Image cards;
    private Button dealBtn;
    private Button hiBtn;
    private Button loBtn;
    
    @Override
    public void start(Stage primaryStage) {
        root = new StackPane();
        root.getChildren().add(addBackground());
        BorderPane bp = new BorderPane();
        bp.setCenter(createCardView());
        bp.setRight(createGameButtons());
        root.getChildren().add(bp);
        primaryStage.setTitle("HiLo Game");
        primaryStage.setScene(new Scene(root, bgImage.getWidth(), bgImage.getHeight()));
        primaryStage.show();
    }
    
    private ImageView addBackground() {
        bgImage = new Image("/image/background.jpg");
        ImageView bgView = new ImageView(bgImage);
        return bgView;
    }
    
    private HBox createCardView() {
        cardBack = new Image("/image/cardback.jpg");
        cards = new Image("/image/cards.png");
        cv[0] = new ImageView();
        cv[0].setImage(cardBack);
        cv[1] = new ImageView();
        cv[1].setImage(cardBack);
        HBox cardBox = new HBox(30, cv);
        return cardBox;
    }
    
    private void showCard(int pos, int card) {
        int suit = Math.floorDiv(card, 13);
        int val = Math.floorMod(card, 13);
        double dx = cards.getWidth() / 13;
        double dy = cards.getHeight() / 4;
        double x = dx * val;
        double y = dy * suit;
        cv[pos].setImage(cards);
        cv[pos].setViewport(new Rectangle2D(x, y, dx, dy));
    }
    
    private Node createGameButtons() {
        dealBtn = new Button("Deal cards");
        dealBtn.setMaxWidth(Double.MAX_VALUE);
        dealBtn.setOnAction((ActionEvent e) -> {
            this.dealCards();
        });
        hiBtn = new Button("Bet on high");
        hiBtn.setMaxWidth(Double.MAX_VALUE);
        hiBtn.setDisable(true);
        loBtn = new Button("Bet on low");
        loBtn.setMaxWidth(Double.MAX_VALUE);
        loBtn.setDisable(true);
        VBox vb = new VBox(10, dealBtn, hiBtn, loBtn);
        vb.setPadding(new Insets(0, 10, 0, 10));
        vb.setAlignment(Pos.CENTER);
        return vb;
    }

    private void dealCards() {
        dealBtn.setDisable(true);
    }
    
}
