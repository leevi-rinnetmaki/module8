import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stringManipulatorTest {

    @Test
    void concatenate() {
        stringManipulator s = new stringManipulator();
        assertEquals("helloworld", s.concatenate("hello", "world"));
    }

    @Test
    void findlength() {
        stringManipulator s = new stringManipulator();
        assertEquals(5, s.findlength("hello"));
    }

    @Test
    void convertToUpperCase() {
        stringManipulator s = new stringManipulator();
        assertEquals("HELLO", s.convertToUpperCase("hello"));
    }

    @Test
    void convertToLowerCase() {
        stringManipulator s = new stringManipulator();
        assertEquals("hello", s.convertToLowerCase("HELLO"));
    }

    @Test
    void containsSubstring() {
        stringManipulator s = new stringManipulator();
        assertEquals(true, s.containsSubstring("hello", "he"));
        assertEquals(false, s.containsSubstring("hello", "thursday"));

    }
}