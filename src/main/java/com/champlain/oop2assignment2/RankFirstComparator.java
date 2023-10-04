package com.champlain.oop2assignment2;

import java.util.Comparator;

/**
 * defines a comparator to sort card objects by rank
 */
public class RankFirstComparator implements Comparator<Card> {
    /**
     * method that defines the comparison method of the 2 cards
     * @param pCard1 the first card to be compared.
     * @param pCard2 the second card to be compared.
     * @return the compared cards.
     */
    public int compare(Card pCard1,Card pCard2){
        if(pCard1 == null || pCard2 == null){
            throw new IllegalArgumentException("Card Cannot Be Null");
        }
        return pCard1.getRank().compareTo(pCard2.getRank());
    }
}

