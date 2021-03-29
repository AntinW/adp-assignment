package za.ac.cput.AdpAssignment1;

/**
 * @Author: Tye Walker - 218338562
 * CarTest.java with each TDD test feature required.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Tye Walker - 21833562
 * CarTest.java - All TDD test features required:
 */
 
class CarTest {

    private Car car1;
    private Car car2;
    private Car car3;

    @BeforeEach
    void setUp() {
        car1 = new Car();
        car2 = new Car();
        car3 = car1;
    }

    /**
     * i. Object Equality:
     * This test checks if two values/objects are equal.
     */
    @Test
    void testEquality() {
        assertEquals(car1,car3);
    }

    /**
     * ii. Object Identity:
     * This test checks if two values/objects are the same.
     */
    @Test
    void testIdentity() {
        assertSame(car3, car1);
    }

    /**
     * iii. Failing Test:
     * This test is created to fail on purpose.
     * This is done to make sure there are no false passes on other tests.
     */
    @Test
    void testFailing()  {
        fail("This failed.");
    }

    /**
     * iv. Timeouts:
     * This test will be stopped after 10 seconds.
     */
    @Test
    @Timeout(10)
    void testTimeout() throws InterruptedException {
        Thread.sleep(5000);                         //Waits 5 seconds (5000 milliseconds)
        System.out.println("This test passed!");
    }

    /**
     * v. Disabling Test:
     * This test is disabled by using "@Disabled".
     */
    @Disabled("This is an example of a disabled/ignored method")
    @Test
    void testDisabling() {
        assertEquals(10+20, 15+15);
    }

}