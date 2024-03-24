package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinTest {
    @Test
    void whenFirstMin() {
        int[] array = {0, 5, 10};
        int expected = 0;
        assertThat(Min.findMin(array))
                .isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {10, 5, 3};
        int expected = 3;
        assertThat(Min.findMin(array))
                .isEqualTo(expected);
    }

    @Test
    void whenMidMin() {
        int[] array = {10, 5, 13};
        int expected = 5;
        assertThat(Min.findMin(array))
                .isEqualTo(expected);
    }
}