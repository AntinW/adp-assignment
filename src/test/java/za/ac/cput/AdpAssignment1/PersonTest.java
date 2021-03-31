package za.ac.cput.AdpAssignment1;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author : Robin White 218034555
 * Unit test for simple Person.
 */
public class PersonTest
{
    /**
     * Rigorous Test :-)
     */

   private Person p1;
   private Person p2;
   private Person p3;



   @BeforeEach
    void setUp(){
       p1 = new Person();
       p2 = new Person();
       p3 = p1;

   }

   //Equality Test
   @Test
   void testEquality(){
       assertEquals(p1, p3);
   }

   //Identity Test
   @Test
    void testIdentity(){
       assertSame(p1 , p1);
   }

   //Failing Test
   @Test
     void testFail(){
       if(p1 != p2){
           fail("This Test has failed");
       }
   }

   //Disable Test
   @Disabled("Test was DISABLED")
   @Test
   void testDisable(){
       assertEquals(10, 9+1);
   }

    //Timeout Test
    @Test
    @Timeout(3)
    void testTimeout() throws InterruptedException{
        Thread.sleep(5000);
        while(true) {
        }
    }












}
