package se.salt.precourse.firstjavaapp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void greetTest() {
        String result = Greeter.greet("Tatiana");
        assertEquals(result, "Welcome to SALT, Tatiana");
    }
}
