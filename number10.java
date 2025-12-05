
/**
 * Write a description of class number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number10
{
   
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 4, 6};
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                index = i;
                break;
            }
        }

        System.out.println("First even index: " + index);
    }
}

