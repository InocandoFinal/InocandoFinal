
/**
 * Write a description of class number16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number16
{
    
    public static void main(String[] args) {
        int number = 12345;
        int count = 0;

        int temp = number;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Digits: " + count);
    }
}

