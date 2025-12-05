
/**
 * Write a description of class number18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number18
{
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 3, 8};
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                }
            }
        }

        if (hasDuplicate)
            System.out.println("Array has duplicates.");
        else
            System.out.println("Array has NO duplicates.");
    }
}

