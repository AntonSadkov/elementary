package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixTest {

    @Test
    void when2on2() {
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(Matrix.multiple(2))
                .isDeepEqualTo(expected);
    }

    @Test
    void when5on5() {
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25},
        };
        assertThat(Matrix.multiple(5))
                .isDeepEqualTo(expected);
    }
}