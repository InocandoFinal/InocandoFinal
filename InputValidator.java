
/**
 * Write a description of class keth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.util.Scanner;

public class InputValidator {

        public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        
        
        int number;


        do {
            
            System.out.print("Please enter a number between 1 and 100 (inclusive): ");
            
            
            if (scanner.hasNextInt()) {
                
                number = scanner.nextInt(); 

                
                if (number >= 1 && number <= 100) {
                    
                    
                    System.out.println("Thank you! You entered a valid number: " + number);
                } else {
                    
                    System.out.println("Error: The number must be between 1 and 100. Try again.");
                }
            } else {
                
                System.out.println("Error: Invalid input. Please enter a whole number.");
                scanner.next(); 
                number = 0; 
            }
            
        } while (number < 1 || number > 100); 

     
        scanner.close();
    }
}
