package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RubThen1Dot4Euro() {
        float euro = Converter.rubToEur(140);
        float expected = 1.4f;
        float eps = 0.0001f;
        assertThat(euro).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RubThen1Dot8Euro() {
        float euro = Converter.rubToEur(180);
        float expected = 1.8f;
        float eps = 0.01f;
        assertThat(euro).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert123RubThen1Dot3666Usd() {
        float usd = Converter.rubToUsd(123);
        float expected = 1.3666f;
        float eps = 0.0001f;
        assertThat(usd).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RubThen2Usd() {
        float usd = Converter.rubToUsd(180);
        float expected = 2f;
        float eps = 0.1f;
        assertThat(usd).isEqualTo(expected, withPrecision(eps));
    }
}