package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixSumTest {

    @Test
    void whenSingle() {
        int[][] array = {{10}};
        int expected = 10;
        assertThat(MatrixSum.sum(array))
                .isEqualTo(expected);
    }

    @Test
    void whenTwo() {
        int[][] array = {
                {5},
                {2, 3}
        };
        int expected = 10;
        assertThat(MatrixSum.sum(array))
                .isEqualTo(expected);
    }

    @Test
    void whenThree() {
        int[][] array = {
                {2},
                {2, 2},
                {2, 1, 1}
        };
        int expected = 10;
        assertThat(MatrixSum.sum(array))
                .isEqualTo(expected);
    }
}