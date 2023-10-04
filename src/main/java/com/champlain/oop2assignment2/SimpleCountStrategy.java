package com.champlain.oop2assignment2;

import java.util.List;

/**
 * Creating the SimpleCountStrategy like stated in the task.
 */
public class SimpleCountStrategy implements ScoringStrategy {

    /**
     * @param cards parameter
     * @return the number of cards.
     */
    @Override
    public int calculateScore(List<Card> cards) {
        return cards.size();
    }
}
