package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinDiapasonTest {

    @Test
    void whenFirstMin() {
        int[] array = {-1, 0, 5, 10};
        int expected = 0;
        assertThat(MinDiapason.findMin(array, 1, 3))
                .isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {10, 5, 3, 1};
        int expected = 1;
        assertThat(MinDiapason.findMin(array, 2, 3))
                .isEqualTo(expected);
    }

    @Test
    void whenMidMin() {
        int[] array = {10, 2, 5, 13};
        int expected = 2;
        assertThat(MinDiapason.findMin(array, 0, 2))
                .isEqualTo(expected);
    }
}