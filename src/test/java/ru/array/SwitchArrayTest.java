package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {
    @Test
    void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        assertThat(SwitchArray.swap(input, 0, 3))
                .containsExactly(expected);
    }

    @Test
    void whenSwap2To3() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {1, 2, 4, 3, 5, 6, 7, 8, 9};
        assertThat(SwitchArray.swap(input, 2, 3))
                .containsExactly(expected);
    }
}