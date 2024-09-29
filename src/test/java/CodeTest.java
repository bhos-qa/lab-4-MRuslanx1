import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeTest {

    @Test // Change @CodeTest to @Test
    void testCalculateDiscount() {
        App logic = new App();
        assertEquals(20, logic.calculateDiscount(100, 20));
        assertEquals(0, logic.calculateDiscount(100, 0));
    }

    @Test // Change @CodeTest to @Test
    void testIsValidUser() {
        App logic = new App();
        assertTrue(logic.isValidUser("validUser123"));
        assertFalse(logic.isValidUser("short"));
        assertFalse(logic.isValidUser(null));
    }

    @Test // Change @CodeTest to @Test
    void testAddTwoNumbers() {
        App logic = new App();
        assertEquals(5, logic.addTwoNumbers(2, 3));
        assertEquals(0, logic.addTwoNumbers(0, 0));
        assertEquals(-1, logic.addTwoNumbers(1, -2));
    }

    @Test // Change @CodeTest to @Test
    void testCalculateTax() {
        App logic = new App();
        assertEquals(2000, logic.calculateTax(10000));
        assertEquals(0, logic.calculateTax(0));
        assertEquals(500, logic.calculateTax(2500));
    }

    @Test // Change @CodeTest to @Test
    void testIsPrime() {
        App logic = new App();
        assertTrue(logic.isPrime(5));
        assertFalse(logic.isPrime(4));
        assertFalse(logic.isPrime(-1));
    }
}
