
/**
 * Write a description of class number15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.util.Scanner;
public class number15
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers greater than 50:");
        for (int n : arr) {
            if (n > 50)
                System.out.println(n);
        }
    }
}

