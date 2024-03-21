package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SquareTest {

    @Test
    void whenBound3Then014() {
        int[] expected = new int[] {0, 1, 4};
        assertThat(Square.calculate(3))
                .containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(Square.calculate(5))
                .containsExactly(expected);
    }
}