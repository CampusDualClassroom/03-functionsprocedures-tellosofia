package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(this.outContent));
        System.setErr(new PrintStream(this.errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(this.originalOut);
        System.setErr(this.originalErr);
    }

    @Test
    @DisplayName("Test greetings message. Username provided → TestUser")
    void testGreetingMessage(){
        String user = "TestUser";
        assertEquals("Hola. Bienvenido TestUser", Exercise.greetings(user), "Message is not correct.");
    }

    @Test
    @DisplayName("Test error message. Username provided → TestUser")
    void testErrorMessage(){
        String user = "TestUser";
        assertEquals("Ups. No pudimos validar tus datos. Tu credenciales no son correctas, TestUser", Exercise.error(user), "Message is not correct.");
    }

    @Test
    @DisplayName("Test successful check user. Username provided → Sebas, pass provided → sebas01 ")
    void testSuccessfulVerify(){
        Exercise.checkUser("Sebas", "sebas01");
        boolean check = this.outContent.toString().contains("Hola. Bienvenido Sebas");
        assertTrue(check, "Greetings message is not correct");

    }

    @Test
    @DisplayName("Test unsuccessful check user. Username provided → TestUser, pass provided → sebas01 ")
    void testUnsuccessfulVerify(){
        Exercise.checkUser("TestUser", "sebas01");
        boolean check = this.outContent.toString().contains("Ups. No pudimos validar tus datos. Tu credenciales no son correctas, ");
        assertTrue(check, "Error message is not correct");
    }
}