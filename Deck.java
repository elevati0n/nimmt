package com.company;

import java.util.*;

/**
 * Created by clean on 1/17/16.
 */
public class Deck {

    Deque<Card> deck;
    //Random random;

    Deck() {
        this.deck = new ArrayDeque<>();

        int m = 0;

        for (int k = 1; k < 105; k++) {
            // bull number is at least 2
            deck.push(new Card(k, m + 2));
            // and at most 6
            m = (m + 1) % 6;
        }
    }

    Card topCard() {
        return this.deck.pop();
    }



}
