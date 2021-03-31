package za.ac.cput.AdpAssignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;


class DVDTest {
    private DVD dvd0;
    private DVD dvd1;
    private DVD dvd2;


    @BeforeEach
    void setUp() {
         dvd0 = new DVD();
         dvd1 = new DVD();
         dvd2 =  dvd1;
    }

    //Testing for equality of object DVD and found tha dvd1 == dvd2
    //while dvd1 not == dvd0 , if i remove the comments in line num 26 the method fails
    @Test
    void testEquality() {
        assertEquals(dvd1, dvd2);
        //assertEquals(dvd1, dvd0);

    }

    //Testing for identity of DVD objects, dvd1 identical to dv2 while dvd1 and dvd0 || dvd2 and dvd0 not.
    @Test
    void testIdentity()
    {
        assertSame(dvd1, dvd2);
    }

    // Testing the unit to fail unless you comment out line 40
    @Test
    void failTest(){
        try{
           fail("Test is failing");
            } catch (Exception e) {
            e.printStackTrace();
            assertTrue(true);
        }
    }


    @Test
    @Timeout(2000)
         void testTimeout(){
        int maxNum = 5;
        for (int i = 5; i <= maxNum; i++){
            System.out.println("Time out");
        }
    }

    @Disabled
    @Test
    void disableMethod(){
        testIdentity();
        System.out.println();
    }







}