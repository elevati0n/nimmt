package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * Created by clean on 1/17/16.
 */
public class Player {

    int playerNumber;
    //would use an array for later but this is simpler
    Deque<Card> hand = new ArrayDeque<>();
    Card chosenCard;

    Player(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    void pickupCard(Card card) {
        card.owner = this;
        hand.push(card);
    }

    public void viewTable(Table gameTable) {
        for (CardStack stack : gameTable.stacks) {
            stack.view();
        }
    }

    public void determineCard() {
        this.chosenCard = hand.pop();
    }

    public Card playCard() {
        return chosenCard;
    }

}
