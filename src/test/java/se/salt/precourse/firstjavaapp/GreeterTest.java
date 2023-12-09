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

    @Test
    void daysTest() {
        LocalDate today = LocalDate.now();
        LocalDate futureDay = today.plusDays(10);
        String messege = Greeter.days(futureDay.toString());
        assertEquals( "Today it is 10 days left until the course starts", messege);
    }
}