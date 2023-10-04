package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand extends CardCollection {
    private final List<Card> aCards = new ArrayList<Card>();

    public Hand() {
    }

    public void addCard(Card pCard) {
        this.aCards.add(pCard);
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    /**
     * method that uses the SuitFirstComparator class to sort the deck by suit first
     */
    public void sortBySuitFirst(){
        aCards.sort(new SuitFirstComparator());
    }
}
