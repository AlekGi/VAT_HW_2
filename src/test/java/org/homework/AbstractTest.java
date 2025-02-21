package org.homework;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AbstractTest {

    private static int counter = 0;

    @BeforeAll
    public static void initialize(){
        counter = 0;
        System.out.println("Запуск тестов");
    }

    @BeforeEach
    public void before() {
        counter++;
        System.out.println("Запуск теста: " + counter);
    }

    @AfterEach
    public void after() {
        counter--;
        System.out.println("Тест: " + counter + " пройден");
    }

    @AfterAll
    public static void afterAll() {
        counter = 0;
        System.out.println("Тестирование окончено");
    }
}
