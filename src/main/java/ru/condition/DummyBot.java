package ru.condition;

public class DummyBot {
    public static String answer(String question) {
        String botResponse = "I don't know. Please, ask another question.";

        if ("Hi, bot.".equals(question)) {
            botResponse = "He, SmartAss.";
        } else if ("Bye.".equals(question)) {
            botResponse = "See you later.";
        }

        return botResponse;
    }

    public static void main(String[] args) {
        System.out.println(answer("Hi, bot."));
        System.out.println(answer("Bye."));
    }
}
