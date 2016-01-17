package com.company;

/**
 * Created by clean on 1/17/16.
 */
public class Card implements Comparable<Card> {
    int faceValue;
    int bullNumber;
    Player owner;

    Card(int faceValue, int bullNumber){
        // a unique face value between 1 and 104 (inclusive)
        if (faceValue > 0 && faceValue < 105) {
            this.faceValue = faceValue;
        }
        //  a "bull" number between 2 and 7 (inclusive)
        if (bullNumber > 1 && bullNumber < 8 )
        {
            this.bullNumber = bullNumber;
        }
    }

    @Override
    public String toString() {
        return "FaceVale = " + faceValue + "\n       " +
                "BullNumber : " + bullNumber;
    }


    public int compareTo(Card that) {
        if (this.faceValue > that.faceValue) {
            return 1;
        } else {
            return -1;
        }
    }
}
