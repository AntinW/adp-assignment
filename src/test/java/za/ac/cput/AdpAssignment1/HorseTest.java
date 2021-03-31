package za.ac.cput.AdpAssignment1;

/**
 * Author: Tauriq-Allie Wilkinsob
 *  * Subject: ADP372S
 *  * Student No.: 219071330
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    private Horse horse1,horse2,horse3;

    @BeforeEach
    void setUp()
    {
        horse1 = new Horse();
        horse2 = new Horse();
        horse3 = horse1;
    }

     //i. Object Equality

    @Test
    void testEquality() {
        assertEquals(horse1,horse3);
    }


     // ii. Object Identity

    @Test
    void testIdentity() {
        assertSame(horse3, horse1);
    }


     // iii. Failing Test

    @Test
    void testFailing()  {
        fail(" Failed!!!!!!!!!!!");
    }


   // iv. Timeouts

    @Test
    @Timeout(10)
    void testTimeout() throws InterruptedException {
        Thread.sleep(200);                         //Waits 5 seconds (5000 milliseconds)
        System.out.println(" Test Passed");
    }

    //v. Disabling Test
    @Disabled
    @Test
    void testDisabling() {
        System.out.println("This test is disabled");
    }

}