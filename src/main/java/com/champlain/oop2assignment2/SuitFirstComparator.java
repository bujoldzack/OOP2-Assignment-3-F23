package com.champlain.oop2assignment2;

import java.util.Comparator;

/**
 * Class that defines a comparator to be used to sort the deck by suit first.
 */
public class SuitFirstComparator implements Comparator<Card> {
    /**
     * compare method that compares the 2 cards.
     * @param pCard1 the first card to be compared.
     * @param pCard2 the second card to be compared.
     * @return the compared cards.
     */
    @Override
    public int compare(Card pCard1,Card pCard2) {
        // Input validation
        if(pCard1 == null || pCard2 == null){
            throw new IllegalArgumentException("Card cannot be null");
        }
        //compares suits
        int comparedSuits = pCard1.getSuit().compareTo(pCard2.getSuit());
        if (comparedSuits != 0) {
            return comparedSuits;
        }
        // Compares rank
        return pCard1.getRank().compareTo(pCard2.getRank());

    }
}
