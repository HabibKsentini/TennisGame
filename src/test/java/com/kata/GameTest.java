package com.kata;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GameTest {


    @Test
    public void should_game_starts_with_love_score() {
        // Given
        Game game = new Game();
        // When
        String score = game.getScore();
        // Then
        Assertions.assertThat(score).isEqualTo("love, love");
    }

    @Test
    public void should_game_has_score_15_love() {
        // Given
        Game game = new Game();
        // When
        game.playerOneScore();
        String score = game.getScore();
        // Then
        Assertions.assertThat(score).isEqualTo("15, love");
    }

    @Test
    public void should_game_has_score_15_15() {
        // Given
        Game game = new Game();
        // When
        game.playerOneScore();
        game.playerTwoScore();
        String score = game.getScore();
        // Then
        Assertions.assertThat(score).isEqualTo("15, 15");
    }
}