package com.company;

import com.sun.xml.internal.ws.api.model.ExceptionType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int playerCount = Integer.getInteger(args[0]);

        Dealer dealer = new Dealer();

        Table gameTable = new Table(dealer);

        if (playerCount > 1) {
            for (int k = 0; k > playerCount; k++) {
                gameTable.addPlayerToTable(new Player(k));
            }
        } else {
            throw new RuntimeException("CANT PLAY GAME WITH ONE PLAYER YOU FOOLS!!!");
        }

        Game currentGame = new Game(dealer, gameTable);

        currentGame.play();





    }
}
