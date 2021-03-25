package za.ac.cput.AdpAssignment1;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

/**@author 219088470
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    private App app_old;
    private App app_new;

    @BeforeEach
    void setUp()
    {
        app_old = new App();
        app_new = new App();
    }

    @Test
    void testIdentity()
    {
        assertSame(app_old, app_new);
    }

    @Test
    void testEquality()
    {
        assertEquals(app_old, app_new);
    }

    @Test
    public static void failingTest()
    {

    }

    @Test
    @Timeout(100)
    public void testTimeout()
    {
        assertNotSame(app_old, app_new);
    }

    @Ignore
    @Test
    public void disablingTest()
    {
        assertNull(app_old);
    }

}
