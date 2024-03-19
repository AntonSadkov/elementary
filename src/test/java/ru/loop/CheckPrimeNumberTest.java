package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckPrimeNumberTest {

    @Test
    void when5() {
        assertThat(CheckPrimeNumber.check(5)).isTrue();
    }

    @Test
    void when4() {
        assertThat(CheckPrimeNumber.check(4)).isFalse();
    }

    @Test
    void when1() {
        assertThat(CheckPrimeNumber.check(1)).isFalse();
    }
}