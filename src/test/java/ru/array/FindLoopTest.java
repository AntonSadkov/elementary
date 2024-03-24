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

    @Test
    void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int expected = 5;
        assertThat(FindLoop.indexInRange(data, 8, 2, 5))
                .isEqualTo(expected);
    }

    @Test
    void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = {5, 10, 2, 4, 8, 14, 3, 21, 16};
        int expected = 3;
        assertThat(FindLoop.indexInRange(data, 4, 1, 8))
                .isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas2Then3() {
        int[] data = {5, 2, 10, 2, 4};
        int expected = 3;
        assertThat(FindLoop.indexInRange(data, 2, 2, 4))
                .isEqualTo(expected);
    }

    @Test
    void whenDiapasonHasNot2ThenMinus1() {
        int[] data = {5, 1, 10, 1, 4};
        int expected = -1;
        assertThat(FindLoop.indexInRange(data, 2, 0, 4))
                .isEqualTo(expected);
    }
}