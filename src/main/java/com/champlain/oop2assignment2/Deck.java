package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck extends CardCollection implements CardSource {
    private final List<Card> aCards = new ArrayList<Card>();
    private static final Deck INSTANCE = new Deck();

    private Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    public static Deck instance() {
        return INSTANCE;
    }

    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
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
