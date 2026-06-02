import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        
        // Factorials are not defined for negative numbers
        if (num < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Stores the final result
            
            // Loop from 1 to the given number
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        
        scanner.close();
    }
}
    

