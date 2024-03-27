package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {

    @Test
    void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        assertThat(MatrixCheck.monoHorizontal(input, 1)).isTrue();
    }

    @Test
    void whenNotMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '}
        };
        assertThat(MatrixCheck.monoHorizontal(input, 1)).isFalse();
    }

    @Test
    void whenHasMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '}
        };
        assertThat(MatrixCheck.monoVertical(input, 1)).isTrue();
    }

    @Test
    void whenNotMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '}
        };
        assertThat(MatrixCheck.monoVertical(input, 2)).isFalse();
    }

    @Test
    void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expected = {'X', 'X', 'X'};
        assertThat(MatrixCheck.extractDiagonal(input))
                .containsExactly(expected);
    }

    @Test
    void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'}
        };
        char[] expected = {'1', '1', '1'};
        assertThat(MatrixCheck.extractDiagonal(input))
                .containsExactly(expected);
    }

    @Test
    void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };
        char[] expected = {'X', 'Y', 'Z'};
        assertThat(MatrixCheck.extractDiagonal(input))
                .containsExactly(expected);
    }

    @Test
    void whenDataMonoVerticalByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        assertThat(MatrixCheck.isWin(input)).isTrue();
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        assertThat(MatrixCheck.isWin(input)).isFalse();
    }

    @Test
    void whenDataMonoHorizontalByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        assertThat(MatrixCheck.isWin(input)).isTrue();
    }

    @Test
    void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.isWin(input)).isFalse();
    }

    @Test
    void whenDataGoingLimitThenFalse() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X', 'X'}
        };
        assertThat(MatrixCheck.isWin(input)).isFalse();
    }
}