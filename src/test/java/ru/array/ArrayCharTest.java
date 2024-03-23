package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayCharTest {
    @Test
    void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        assertThat(ArrayChar.startWith(word, pref)).isTrue();
    }

    @Test
    void whenStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        assertThat(ArrayChar.startWith(word, pref)).isFalse();
    }
}