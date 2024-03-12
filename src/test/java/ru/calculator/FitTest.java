package ru.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan184Then96Dot6() {
        short manHeight = 184;
        double expected = 96.6;
        assertThat(Fit.manWeight(manHeight))
                .isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenWoman168Then66Dot69() {
        short womanHeight = 168;
        double expected = 66.69;
        assertThat(Fit.womanWeight(womanHeight))
                .isEqualTo(expected, withPrecision(0.01));
    }
}