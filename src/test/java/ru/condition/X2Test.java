package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;

        assertThat(X2.calc(a, b, c, x)).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;

        assertThat(X2.calc(a, b, c, x)).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;

        assertThat(X2.calc(a, b, c, x)).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;

        assertThat(X2.calc(a, b, c, x)).isEqualTo(expected);
    }
}