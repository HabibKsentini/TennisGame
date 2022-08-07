package com.kata;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private int playerOneScore = 0;
    private int playerTowScore = 0;

    private final static Map<Integer, String> SCORE_MAP;


    public Game() {
        this.playerOneScore = 0;
        this.playerTowScore = 0;
    }

    static {
        SCORE_MAP = new HashMap<>();
        SCORE_MAP.put(0, "love");
        SCORE_MAP.put(1, "15");
    }

    public String getScore() {
        return SCORE_MAP.get(playerOneScore) + ", " + SCORE_MAP.get(playerTowScore);
    }

    public void playerOneScore() {
        playerOneScore++;
    }

    public void playerTwoScore() {
        playerTowScore++;
    }
}
