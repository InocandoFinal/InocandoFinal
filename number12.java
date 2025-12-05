
/**
 * Write a description of class number12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number12
{
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 7, 5, 2};
        int value = 5;
        int count = 0;

        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }

        if (count >= 3)
            System.out.println(value + " appears at least 3 times.");
        else
            System.out.println(value + " does NOT appear 3 times.");
    }
}

