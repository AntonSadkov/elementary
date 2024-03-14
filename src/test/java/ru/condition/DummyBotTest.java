package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String expected = "He, SmartAss.";
        assertThat(DummyBot.answer("Hi, bot."))
                .isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String expected = "See you later.";
        assertThat(DummyBot.answer("Bye."))
                .isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String expected = "Can you add two plus two?";
        assertThat(DummyBot.answer(expected))
                .isEqualTo("I don't know. Please, ask another question.");
    }
}