
/**
 * Write a description of class number20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number20
{
    
    public static void main(String[] args) {
        int[] arr = {10, 22, 35, 40, 18, 28};

        for (int num : arr) {
            if (num % 2 == 0 && num > 20) {
                System.out.println(num);
            }
        }
    }
}

