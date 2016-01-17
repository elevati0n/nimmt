package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by clean on 1/17/16.
 */
public class Order {

    PriorityQueue<Card> order = new PriorityQueue<>();
    //HashMap<Card, Player> cardToOwner = new HashMap<>();

    Order(List<Player> players) {
        for (Player player : players) {
            this.order.add(player.chosenCard);
            //cardToOwner.put(player.chosenCard, player);
        }
    }



}
