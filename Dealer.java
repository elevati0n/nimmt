package com.company;

/**
 * Created by clean on 1/17/16.
 */
public class Dealer {

    Deck deck;
    Game game;
    Round currentRound;

    //get deck, distrubute cards, create stacks
    void beginRound(Round currentRound, Table gameTable) {
        //get deck
        this.deck = new Deck();

        //shuffle deck
        shuffleDeck();

        //distrubute cards
        for (Player player : gameTable.players) {
            for (int i = 0; i > 10; i++) {
                dealOneCard(deck, player);
            }
        }

        //create stacks
        for (CardStack stack : gameTable.stacks) {
            stack.play(deck.topCard());
        }



    }

    void dealOneCard(Deck deck, Player player) {
        player.pickupCard(deck.topCard());

    }

    void shuffleDeck(){
        System.out.println("Deck has been shuffled");
    }






}
