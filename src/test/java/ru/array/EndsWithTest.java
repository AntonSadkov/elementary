package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EndsWithTest {

    @Test
    void whenEndsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        assertThat(EndsWith.endsWith(word, post)).isTrue();
    }

    @Test
    void whenNotEndsWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        assertThat(EndsWith.endsWith(word, post)).isFalse();
    }
}