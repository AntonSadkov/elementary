package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void whenExist() {
        assertThat(Triangle.exist(3, 2, 2))
                .isTrue();
    }

    @Test
    void whenNotExist() {
        assertThat(Triangle.exist(3, 1, 2))
                .isFalse();
    }
}