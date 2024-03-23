package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EqLastTest {

    @Test
    void whenEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {1, 3, 4};
        assertThat(EqLast.check(left, right)).isTrue();
    }

    @Test
    void whenNotEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {1, 3, 3};
        assertThat(EqLast.check(left, right)).isFalse();
    }
}