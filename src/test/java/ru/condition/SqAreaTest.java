package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Then2() {
        int expected = 2;
        assertThat(SqArea.square(6, 2))
                .isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K2Then0Dot888() {
        double expected = 0.888;
        assertThat(SqArea.square(4, 2))
                .isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenP8K3Then3() {
        int expected = 3;
        assertThat(SqArea.square(8, 3)).isEqualTo(expected);
    }
}