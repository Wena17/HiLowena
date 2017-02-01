/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp.hilo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

public class HiLo extends Application {
    
    private StackPane root;  
    private Image bgImage;
    private Image cardBack;
    private ImageView[] cv = new ImageView[2];
    private Image cards;
    private Button dealBtn;
    private Button hiBtn;
    private Button loBtn;
    
    private List<Integer> stack;
    private int card1;
    private int card2;
    private boolean betHigh;

    public static void main(String[] args) {
        launch();
    }
    
    @Override
    public void start(Stage primaryStage) {
        shuffleCardStack();
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

    private void shuffleCardStack() {
        stack = new ArrayList<Integer>();
        for (int i = 0; i < 52; i++) {
            stack.add(i);
        }
        Collections.shuffle(stack);
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
        hiBtn.setOnAction((ActionEvent e) -> {
            this.betHigh();
        });
        hiBtn.setDisable(true);
        loBtn = new Button("Bet on low");
        loBtn.setMaxWidth(Double.MAX_VALUE);
        loBtn.setOnAction((ActionEvent e) -> {
            this.betLow();
        });
        loBtn.setDisable(true);
        VBox vb = new VBox(10, dealBtn, hiBtn, loBtn);
        vb.setPadding(new Insets(0, 10, 0, 10));
        vb.setAlignment(Pos.CENTER);
        return vb;
    }

    private void dealCards() {
        dealBtn.setDisable(true);
        card1 = stack.remove(0);
        card2 = stack.remove(1);
        showCard(0, card1);
        hiBtn.setDisable(false);
        loBtn.setDisable(false);
    }

    private void betHigh() {
        betHigh = true;
        processBet();
    }

    private void betLow() {
        betHigh = false;
        processBet();
    }
    
    private void processBet() {
        hiBtn.setDisable(true);
        loBtn.setDisable(true);
        showCard(1, card2);
        if (isHigher(card2, card1) == betHigh) {
            // won bet
        } else {
            // lost bet
        }
    }

    private boolean isHigher(int a, int b) {
        int aVal = Math.floorMod(a, 13);
        int bVal = Math.floorMod(b, 13);
        if (aVal > bVal) return true;
        if (aVal < bVal) return false;
        int aSuit = Math.floorDiv(a, 13);
        int bSuit = Math.floorDiv(b, 13);
        if (aSuit > bSuit) return true;
        if (aSuit < bSuit) return false;
        throw new RuntimeException("Someone has been cheating!");
    }

}
