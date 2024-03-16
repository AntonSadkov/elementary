package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DivideBySixTest {

    @Test
    void whenNumberDivideBy6() {
        String expected = "This number divided by 6.";
        assertThat(DivideBySix.checkNumber(24))
                .isEqualTo(expected);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        String expected = "This number divided by 3, but isn't the even number.";
        assertThat(DivideBySix.checkNumber(9))
                .isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndEven() {
        String expected = "This number doesn't divide by 3, but it is the even number.";
        assertThat(DivideBySix.checkNumber(8))
                .isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        String expected = "This number doesn't divide by 3 and it isn't the even number.";
        assertThat(DivideBySix.checkNumber(5))
                .isEqualTo(expected);
    }
}