package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckTest {

    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true};
        assertThat(Check.mono(data)).isTrue();
    }

    @Test
    void whenDataNoMonoByTrueThenFalse() {
        boolean[] data = {true, false, true};
        assertThat(Check.mono(data)).isFalse();
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = {false, false, false};
        assertThat(Check.mono(data)).isTrue();
    }

    @Test
    void whenDataNoMonoByFalseThenFalse() {
        boolean[] data = {false, true, false};
        assertThat(Check.mono(data)).isFalse();
    }
}