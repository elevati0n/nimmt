package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clean on 1/17/16.
 */
public class Game {

    //Round has many turns
    protected Round currentRound;

    Dealer dealer;

    List<Round> rounds;

    Table gameTable;

    Order order;

    Card highCard;

    Game(Dealer dealer, Table table) {
        this.currentRound = new Round();
        this.dealer = dealer;
        this.gameTable = table;
        this.order = new Order(gameTable.players); //[table.players.size()];
    }

    Round currentRound() {
        return this.currentRound;
    }

    void play() {
        //get deck, distrubute cards, create stacks
        dealer.beginRound(currentRound, gameTable);

        //Card[] inPlayCards = new Card[gameTable.players.size()];

        //pre-turn
        for (Player player : gameTable.players) {
            player.viewTable(gameTable);
            player.determineCard();
        }

        //now have the dealer figure out where the cards go
        this.order = new Order(gameTable.players);

        for (Card card : order.order) {
            //assign card to the correct stack

            //
        }

        // players go in the order of their card values
        // get first value and compare, then decide
        // this should sort them and pop them off in order
        this.order = new Order(gameTable.players);

        for (Card card : order.order) {
            //regular case : place it on the smallest one it is bigger than
            //subtract its value from each of the top cards
            int lowestValue = 9999999;
            for (CardStack stack : gameTable.stacks) {
                if (card.faceValue > stack.topValue()) {
                    int difference = card.faceValue - stack.topValue();
                    if (difference > 0) {
                        if (lowestValue == 9999999) {
                            lowestValue = difference;
                        } else {
                            if (difference > lowestValue) {

                            } else {
                                lowestValue = difference;
                            }
                        }
                    }
                }
            }

            if (lowestValue != 9999999) {

            }



            //if its face value is larger than any of the top stack cards
            if (card.faceValue > gameTable.largestTopStack()) {
                // it is placed on the closet value

            }
            //if this stack consist of 5 cards, the player losers the sum of
            //the bull points

            //if a players card is smaller than all the cards on top of the stacks
            if (card.faceValue < gameTable.lowestTopStack()) {

            }
            //

        }




















    }






}
