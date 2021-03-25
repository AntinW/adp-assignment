package za.ac.cput.AdpAssignment1;

/**@author 219088470
 * Hello world!
 *
 */
public class App 
{
    private String data;
    private int number;

    public App(String data, int number)
    {
        this.data = data;
        this.number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    }
}
