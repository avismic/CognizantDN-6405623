
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @After
    public void tearDown() {
        app = null;
    }

    @Test
    public void testAdd() {
        int a = 5;
        int b = 3;

        int result = app.add(a, b);

        assertEquals("5 + 3 should equal 8", 8, result);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 3;

        int result = app.subtract(a, b);

        assertEquals("5 - 3 should equal 2", 2, result);
    }
}
