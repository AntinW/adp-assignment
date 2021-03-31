package za.ac.cput.AdpAssignment1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**@author 219088470
 * Unit test for simple App.
 */
class AppTest_New
{

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

    @AfterEach
    void tearDown()
    {

    }

    @Test
    void testIdentity()
    {
        assertSame(app_old, app_compare);
        assertNotSame(app_old, app_new);
    }

    @Test
    void testEquality()
    {
        assertEquals(app_old, app_compare);
    }

    @Test
    void failingTest()
    {
        fail("Failing test");
    }

    @Test
    @Timeout(100)
    void testTimeout()
    {
        assertNotSame(app_old, app_new);
    }

    @Disabled
    @Test
    void disablingTest()
    {
        assertNull(app_old);
    }
}