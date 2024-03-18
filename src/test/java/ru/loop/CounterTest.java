package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int expected = 30;
        assertThat(Counter.sumByEven(1, 10))
                .isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToFifteenThenThirtySix() {
        int expected = 36;
        assertThat(Counter.sumByEven(10, 15))
                .isEqualTo(expected);
    }
}