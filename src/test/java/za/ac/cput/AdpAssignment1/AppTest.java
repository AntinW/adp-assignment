package za.ac.cput.AdpAssignment1;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

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

   @Test
   void testEquality(){
       assertEquals(app1, app1);
   }

   @Test
    void testIdentity(){
       assertSame(app1 , app3);
   }



}
