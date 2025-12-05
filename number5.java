
/**
 * Write a description of class number5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number5
{
    
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 9, 7};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}

