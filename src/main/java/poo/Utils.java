package poo;

/**
 *
 * @author pietro-miranda
 */
public class Utils {
    public static void delay(int ms){
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
