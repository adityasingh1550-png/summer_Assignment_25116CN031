import java.util.Scanner;

public class program_2{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.println("\nMultiplication Table for " + number + ":");
        
        // Loop from 1 to 10 to print the multiples
        for (int i = 1; i <= 10; i++) {
            // Calculate product and print formatted string
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
}
    

