package ru.condition;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TreeMaxTest {

    @Test
    void firstMax() {
        int expected = 10;
        assertThat(TreeMax.max(10, 5, 1))
                .isEqualTo(expected);
    }

    @Test
    void secondMax() {
        int expected = 15;
        assertThat(TreeMax.max(10, 15, 1))
                .isEqualTo(expected);
    }

    @Test
    void thirdMax() {
        int expected = 12;
        assertThat(TreeMax.max(10, 5, 12))
                .isEqualTo(expected);
    }

    @Test
    void allEq() {
        int expected = 1;
        assertThat(TreeMax.max(1, 1, 1))
                .isEqualTo(expected);
    }

    @Test
    void firstEqSecond() {
        int expected = 10;
        assertThat(TreeMax.max(10, 10, 1))
                .isEqualTo(expected);
    }

    @Test
    void firstEqThird() {
        int expected = 10;
        assertThat(TreeMax.max(10, 5, 10))
                .isEqualTo(expected);
    }

    @Test
    void secondEqThird() {
        int expected = 10;
        assertThat(TreeMax.max(1, 10, 10))
                .isEqualTo(expected);
    }
}