package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when12To34Then2Dot8284() {
        double expected = 2.8284;
        assertThat(Point.distance(1, 2, 3, 4))
                .isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when11To22Then2Dot4142() {
        double expected = 1.4142;
        assertThat(Point.distance(1, 1, 2, 2))
                .isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when22To33Then2() {
        double expected = 2;
        assertThat(Point.distance(1, 2, 3, 2)).isEqualTo(expected);
    }

    @Test
    void when42To34Then2Dot23() {
        double expected = 2.23;
        assertThat(Point.distance(4, 2, 3, 4))
                .isEqualTo(expected, withPrecision(0.01));
    }
}