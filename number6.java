
/**
 * Write a description of class number6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number6
{
   
    public static void main(String[] args) {
        int[] arr = {5, 8, 11, 2, 7};
        int sum = 0, count = 0;

        for (int n : arr) {
            if (n % 2 != 0) {
                sum += n;
                count++;
            }
        }

        double avg = (count > 0) ? (double) sum / count : 0;
        System.out.println("Average of odd numbers: " + avg);
    }
}

