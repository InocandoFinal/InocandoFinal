
/**
 * Write a description of class number1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


  import java.util.Scanner;
public class number1
{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number between 1 and 100: ");
            num = sc.nextInt();
        } while (num < 1 || num > 100);

        System.out.println("Valid input: " + num);
    }
}


