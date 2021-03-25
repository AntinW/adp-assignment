package za.ac.cput.AdpAssignment1;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Test
{

    private App app_old;
    private App app_new;

    @BeforeEach
    void setUp()
    {
        app_old = new App();
        app_new = new App();
    }

    @org.junit.jupiter.api.Test
    void testIdentity()
    {
        assertSame(app_old, app_new);
    }
}