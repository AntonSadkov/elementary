package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax3To2Then3() {
        assertThat(Max.max(3, 2))
                .isEqualTo(3);
    }

    @Test
    void whenMax2To3Then3() {
        assertThat(Max.max(2, 3))
                .isEqualTo(3);
    }

    @Test
    void whenMax3To3Then3() {
        assertThat(Max.max(3, 3))
                .isEqualTo(3);
    }
}