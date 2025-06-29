
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddPositiveNumbers() {
        App app = new App();
        assertEquals("2 + 3 should equal 5", 5, app.add(2, 3));
    }

    @Test
    public void testAddWithZero() {
        App app = new App();
        assertEquals("5 + 0 should equal 5", 5, app.add(5, 0));
    }
}
