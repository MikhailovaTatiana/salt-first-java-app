package se.salt.precourse.firstjavaapp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StartDateHandlerTest {

    @Test
    void returns2ForDateDwoDaysInTheFuture() {
        LocalDate twoDaysInTheFuture = LocalDate.now().plusDays(2);
        long two = new StartDateHandler().daysToCourseStart(twoDaysInTheFuture.toString());

        assertEquals(2, two);
    }

    @Test
    public void testDateHasOnlyNumbers_ValidInput() {
        String validDate = "2023-12-09";
        boolean result = new StartDateHandler().dateHasOnlyNumbers(validDate);
        assertTrue(result);
    }

    @Test
    public void testDateHasOnlyNumbers_InvalidInput() {
        String invalidDate = "2023-12-0A"; // Contains a non-numeric character 'A'
        boolean result = new StartDateHandler().dateHasOnlyNumbers(invalidDate);
        assertFalse(result);
    }

    @Test
    public void testDateHasOnlyNumbers_NullInput() {
        String nullDate = null;
        boolean result = new StartDateHandler().dateHasOnlyNumbers(nullDate);
        assertFalse(result);
    }

    @Test
    public void testDateHasOnlyNumbers_EmptyInput() {
        String emptyDate = "";
        boolean result = new StartDateHandler().dateHasOnlyNumbers(emptyDate);
        assertFalse(result);
    }

    @Test
    public void testDateHasOnlyNumbers_InvalidFormat() {
        String invalidFormatDate = "2023/12/09"; // Uses a format other than "-"
        boolean result = new StartDateHandler().dateHasOnlyNumbers(invalidFormatDate);
        assertFalse(result);
    }
}
