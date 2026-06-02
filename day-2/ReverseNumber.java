import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        int originalNumber = number; // Store original value for output
        
        // Loop runs until all digits are extracted
        while (number != 0) {
            // Extract the last digit of the number
            int lastDigit = number % 10;
            
            // Append the digit to the reversed number
            reversedNumber = (reversedNumber * 10) + lastDigit;
            
            // Remove the last digit from the number
            number = number / 10;
        }
        
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        
        scanner.close();
    }
}