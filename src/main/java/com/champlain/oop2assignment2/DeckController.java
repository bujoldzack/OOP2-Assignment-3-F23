package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Collections;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    @FXML
    private TextArea aHandTextArea;

    @FXML
    private Label aScoreLabel;

    private final Deck aDeck = new Deck();

    private final Hand aHand = new Hand();

    public void initialize() {
        this.displayCardCollections();
    }

    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayCardCollections();
    }

    /**
     * calls upon the sortBySuitFirst to sort the cards in the deck and hand by suit first.
     * then the second method displays them.
     */
    @FXML
    protected void onSortButtonClick() {
        this.aHand.sortBySuitFirst();
        this.aDeck.sortBySuitFirst();
        this.displayCardCollections();
    }

    @FXML
    protected void onScoreButtonClick() {
        aScoreLabel.setText("Not implemented.");
    }

    @FXML
    protected void onDrawButtonClick() {
        if (!this.aDeck.isEmpty()) {
            this.aHand.addCard(aDeck.draw());
        }
        this.displayCardCollections();
    }

    private void displayCardCollections () {
        this.aDeckTextArea.setText(this.aDeck.toString());
        this.aHandTextArea.setText(this.aHand.toString());
    }
}