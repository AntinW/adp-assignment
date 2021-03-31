package za.ac.cput.AdpAssignment1;
/*
 * @author Antin Micheal Williams
 * Student number: 219212058
 */
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student1, student2, student3;
    @BeforeEach
    void setUp() {
        student1 = new Student();
        student2 = new Student();
        student3 = student1;
    }
//    Object Equality
    @Test
    public void testEquality(){
        assertEquals(student1, student3);
    }
//    Object Identity
    @Test
    public void testIdentity(){
        assertSame(student1, student3);
    }
//    Failing Test
    @Test
    public void testFail(){
    fail("This test fails because this test fails");
    }
//    Timeouts
    @Test
    @Timeout(6)
    public void testTimeout() throws InterruptedException{
        Thread.sleep(5000);
        System.out.println(student1.toString());
    }

//    Disabling Test
    @Disabled
    @Test
    public void testDisabling(){
        System.out.println("This test is disabled");
    }

}