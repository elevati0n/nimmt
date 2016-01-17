package com.company;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by clean on 1/17/16.
 */
public class Table {

    ArrayList<Player> players;
    Dealer dealer;
    Deck deck;
    CardStack[] stacks = new CardStack[3];
    int playerCount;
    Card highCard;
    Card lowCard;

    int largestTopStack() {
        return this.highCard.faceValue;
    }

    int lowestTopStack() {
        return this.lowCard.faceValue;
    }

    CardStack stack(int stackNumber) {
        return stacks[stackNumber];
    }

    Table(Dealer dealer) {
        this.players = new ArrayList<>();
        this.dealer = dealer;
        this.playerCount = 0;
    }

    void addPlayerToTable(Player player) {
        players.add(player);
        this.playerCount = playerCount + 1;
    }













}
