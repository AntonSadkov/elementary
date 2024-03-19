package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitnessTest {

    @Test
    void whenIvanGreatNik() {
        int expected = 0;
        assertThat(Fitness.calc(95, 90))
                .isEqualTo(expected);
    }

    @Test
    void whenIvanLeesByOneNik() {
        int expected = 1;
        assertThat(Fitness.calc(90, 95))
                .isEqualTo(expected);
    }

    @Test
    void whenIvanLeesByFewNik() {
        int expected = 2;
        assertThat(Fitness.calc(50, 90))
                .isEqualTo(expected);
    }

    @Test
    void whenIvanEqualsNik() {
        int expected = 1;
        assertThat(Fitness.calc(90, 90))
                .isEqualTo(expected);
    }
}