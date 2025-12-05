
/**
 * Write a description of class number8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    
    import java.util.Arrays;
public class number8
{

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};

        int[] B = Arrays.copyOf(A, A.length);

        System.out.println("Array A: " + Arrays.toString(A));
        System.out.println("Array B: " + Arrays.toString(B));
    }
}
