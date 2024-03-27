package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MachineTest {

    @Test
    void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] expected = {};
        assertThat(Machine.change(money, price))
                .containsExactly(expected);
    }

    @Test
    void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] expected = {10, 5};
        assertThat(Machine.change(money, price))
                .containsExactly(expected);
    }

    @Test
    void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(Machine.change(money, price))
                .containsExactly(expected);
    }

    @Test
    void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] expected = {10, 5, 2, 1};
        assertThat(Machine.change(money, price))
                .containsExactly(expected);
    }
}