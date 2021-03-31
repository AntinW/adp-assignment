package za.ac.cput.AdpAssignment1;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.condition.DisabledIf;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author : Robin White 218034555
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */

   private App app1;
   private App app2;
   private App app3;



   @BeforeEach
    void setUp(){
       app1 = new App();
       app2 = new App();
       app3 = app1;

   }

   //Equality Test
   @Test
   void testEquality(){
       assertEquals(app1, app3);
   }

   //Identity Test
   @Test
    void testIdentity(){
       assertSame(app1 , app1);
   }

   //Failing Test
   @Test
     void testFail(){
       if(app1 != app2){
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
