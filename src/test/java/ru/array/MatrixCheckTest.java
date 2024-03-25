package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {

    @Test
    void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        assertThat(MatrixCheck.monoHorizontal(input, 1)).isTrue();
    }

    @Test
    void whenNotMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        assertThat(MatrixCheck.monoHorizontal(input, 1)).isFalse();
    }

    @Test
    void whenHasMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        assertThat(MatrixCheck.monoVertical(input, 1)).isTrue();
    }

    @Test
    void whenNotMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        assertThat(MatrixCheck.monoVertical(input, 2)).isFalse();
    }
}