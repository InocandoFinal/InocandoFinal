
/**
 * Write a description of class number9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

   import java.util.Scanner;
public class number9
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter numbers (0 to stop):");

        while ((num = sc.nextInt()) != 0) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}

