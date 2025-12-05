
/**
 * Write a description of class number17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number17
{
    
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 50, 30};

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                second = highest;
                highest = num;
            } else if (num > second && num != highest) {
                second = num;
            }
        }

        System.out.println("Second highest: " + second);
    }
}

