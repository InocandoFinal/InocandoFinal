
/**
 * Write a description of class number7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    
   import java.util.Arrays;
public class number7
{

    public static void main(String[] args) {
        
        int[] numbers = { -5, 10, -3, 7, -9, 0, 4 };

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = Math.abs(numbers[i]);
            }
        }

        System.out.println("Converted array: " + Arrays.toString(numbers));
    }
}


