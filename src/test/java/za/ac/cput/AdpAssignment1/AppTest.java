package za.ac.cput.AdpAssignment1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.Assert.fail;
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
    private App app_compare;

    @BeforeEach
    void setUp()
    {
        app_old = new App();
        app_new = new App();
        app_compare = app_old;
    }

    @Test
    void testIdentity()
    {
        Assert.assertSame(app_old, app_new);
    }

    @Test
    void testEquality()
    {
        Assert.assertEquals(app_old, app_compare);
    }

    @Test
    public static void failingTest()
    {
        fail("Failing test");
    }

    @Test
    @Timeout(100)
    public void testTimeout()
    {
        Assert.assertNotSame(app_old, app_new);
    }

    @Ignore
    @Test
    public void disablingTest()
    {
        Assert.assertNull(app_old);
    }

}
