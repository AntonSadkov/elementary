package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculatorFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        assertThat(Factorial.calculatorFactorial(5))
                .isEqualTo(expected);
    }

    @Test
    void whenCalculatorFactorialForZeroThenOne() {
        int expected = 1;
        assertThat(Factorial.calculatorFactorial(0))
                .isEqualTo(expected);
    }
}