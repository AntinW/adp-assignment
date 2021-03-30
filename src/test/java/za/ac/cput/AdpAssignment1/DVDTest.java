package za.ac.cput.AdpAssignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

    @Test
    void testEquality() {
        assertEquals(dvd1, dvd2 );

    }

    @Test
    void testIdentity(){
        assertSame(dvd1, dvd2);

    }
}