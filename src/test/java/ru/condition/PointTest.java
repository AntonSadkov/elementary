package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when12To34Then2Dot8284() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double expected = 2.8284;
        assertThat(a.distance(b))
                .isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when11To22Then2Dot4142() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double expected = 1.4142;
        assertThat(a.distance(b))
                .isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when22To33Then2() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 2);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    void when42To34Then2Dot23() {
        Point a = new Point(4, 2);
        Point b = new Point(3, 4);
        double expected = 2.23;
        assertThat(a.distance(b))
                .isEqualTo(expected, withPrecision(0.01));
    }
}