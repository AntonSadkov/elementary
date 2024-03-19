package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MortgageTest {

    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int expected = 1;
        assertThat(Mortgage
                .calculatingLoanTerm(1000, 1200, 1))
                .isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        int expected = 2;
        assertThat(Mortgage
                .calculatingLoanTerm(100, 120, 50))
                .isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        int expected = 1;
        assertThat(Mortgage
                .calculatingLoanTerm(1000, 1200, 20))
                .isEqualTo(expected);
    }
}