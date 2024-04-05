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
    void when11To22Then1Dot4142() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double expected = 1.4142;
        assertThat(a.distance(b))
                .isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when12To32Then2() {
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

    @Test
    void when000To002Then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double expected = 2;
        assertThat(a.distance3d(b))
                .isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when042To034Then1() {
        Point a = new Point(0, 4, 2);
        Point b = new Point(0, 3, 4);
        double expected = 1;
        assertThat(a.distance(b))
                .isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when420To340Then2Dot23() {
        Point a = new Point(4, 2, 0);
        Point b = new Point( 3, 4, 0);
        double expected = 2.23;
        assertThat(a.distance(b))
                .isEqualTo(expected, withPrecision(0.01));
    }
}