package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSortArrayOfLength3() {
        int[] data = {3, 1, 2};
        int[] expected = {1, 2, 3};
        assertThat(SortSelected.sort(data))
                .containsExactly(expected);
    }

    @Test
    void whenSortArrayOfLength5() {
        int[] data = {3, 1, 2, 5, 4};
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(SortSelected.sort(data))
                .containsExactly(expected);
    }
}