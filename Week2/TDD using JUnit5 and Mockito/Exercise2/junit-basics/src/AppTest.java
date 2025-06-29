
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    private final App app = new App();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals("2 + 3 should be 5", 5, app.add(2, 3));
    }

    @Test
    public void testAddWithZero() {
        assertEquals("5 + 0 should be 5", 5, app.add(5, 0));
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals("2 * 3 should be 6", 6, app.multiply(2, 3));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals("5 * 0 should be 0", 0, app.multiply(5, 0));
    }
}
