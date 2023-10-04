package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck extends CardCollection implements CardSource {
    private final List<Card> aCards = new ArrayList<Card>();
    private ScoringStrategy scoringStrategy = new SimpleCountStrategy();

    private static final Deck INSTANCE = new Deck();

    private Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    /**
     * Singleton Pattern.
     * @return instance
     */
    public static Deck instance() {
        return INSTANCE;
    }

    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    /**
     * Calculate the score of the list using the scoringStrategy.
     * @param cards list of cards.
     * @return the calculate score.
     */
    public int calculateScore(List<Card> cards) {
        return scoringStrategy.calculateScore(cards);
    }

    /**
     * Set new scoring strategy.
     * @param strategy change scoringStrategy.
     */
    public void setScoringStrategy(ScoringStrategy strategy) {
        this.scoringStrategy = strategy;
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
     /**
     *  uses the RankFirstComparator to sort the deck by rank first.
     */
    public void sortByRankFirst(){
        aCards.sort(new RankFirstComparator());
    }

}
