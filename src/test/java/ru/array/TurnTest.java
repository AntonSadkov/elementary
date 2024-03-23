package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] expected = {2, 6, 1, 4};
        assertThat(Turn.back(input))
                .containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(Turn.back(input))
                .containsExactly(expected);
    }
}