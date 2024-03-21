package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = {5, 2, 3};
        int expected = 0;
        assertThat(FindLoop.indexOf(data, 5))
                .isEqualTo(expected);
    }

    @Test
    void whenArrayHas5ThenMinus1() {
        int[] data = {1, 2, 3};
        int expected = -1;
        assertThat(FindLoop.indexOf(data, 5))
                .isEqualTo(expected);
    }
}