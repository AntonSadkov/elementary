package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoNumberSumTest {

    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int[] expected = {0, 1};
        assertThat(TwoNumberSum.getIndexes(array, 10))
                .containsExactly(expected);
    }

    @Test
    void whenTwoEqualsNumbersYesNoTarget() {
        int[] array = {5, 5};
        int[] expected = {};
        assertThat(TwoNumberSum.getIndexes(array, 12))
                .containsExactly(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int[] expected = {1, 4};
        assertThat(TwoNumberSum.getIndexes(array, 3))
                .containsExactly(expected);
    }

    @Test
    void whenWithOutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int[] expected = {2, 4};
        assertThat(TwoNumberSum.getIndexes(array, 15))
                .containsExactly(expected);
    }
}