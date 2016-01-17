package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * Created by clean on 1/17/16.
 */
public class CardStack {

    Deque<Card> cards = new ArrayDeque<Card>();
    void play(Card card) {
        cards.push(card);
    }

    void clear(){
        this.cards = new ArrayDeque<Card>();
    }

    CardStack(){};

    public void view() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    int topValue() {
        return cards.peekFirst().faceValue;
    }

}
