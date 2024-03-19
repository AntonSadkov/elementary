package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void when5() {
        int expected = 3;
        assertThat(PrimeNumber.calc(5))
                .isEqualTo(expected);
    }

    @Test
    void when11() {
        int expected = 5;
        assertThat(PrimeNumber.calc(11))
                .isEqualTo(expected);
    }

    @Test
    void when2() {
        int expected = 1;
        assertThat(PrimeNumber.calc(2))
                .isEqualTo(expected);
    }
}