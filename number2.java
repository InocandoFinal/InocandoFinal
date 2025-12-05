
/**
 * Write a description of class number2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.Scanner;
public class number2
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 7) {
                count++;
            }
        }

        System.out.println("Number 7 appears " + count + " times.");
    }
}
