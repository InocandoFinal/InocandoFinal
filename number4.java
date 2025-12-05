
/**
 * Write a description of class number4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number4
{
   
    public static void main(String[] args) {
        int[] arr = {5, 9, -1, 3, 10};
        int min = arr[0];
        int max = arr[0];

        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}

