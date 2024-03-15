package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ChessBoardTest {

    @Test
    void wayIs5() {
        int expected = 5;
        assertThat(ChessBoard.way(6, 7, 1, 2))
                .isEqualTo(expected);
    }

    @Test
    void wayIs7() {
        int expected = 7;
        assertThat(ChessBoard.way(7, 0, 0, 7))
                .isEqualTo(expected);
    }

    @Test
    void wayIs3() {
        int expected = 3;
        assertThat(ChessBoard.way(0, 5, 3, 2))
                .isEqualTo(expected);
    }

    @Test
    void wayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(2, 6, 4, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenX1IsMinus1ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(-1, 6, 4, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenY1IsMinus1ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(2, -1, 4, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenX2IsMinus1ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(2, 6, -1, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenY2IsMinus1ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(2, 6, 4, -1))
                .isEqualTo(expected);
    }

    @Test
    void whenX1IsGreater7ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(10, 6, 4, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenY1IsGreater7ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(2, 10, 4, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenX2IsGreater7ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(2, 6, 10, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenY2IsGreater7ThenWayIs0() {
        int expected = 0;
        assertThat(ChessBoard.way(2, 6, 4, 10))
                .isEqualTo(expected);
    }
}