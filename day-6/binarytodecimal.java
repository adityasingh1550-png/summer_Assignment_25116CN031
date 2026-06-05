import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();

        int decimal = 0, power = 0;

        while (binary > 0) {
            int digit = (int)(binary % 10);
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        System.out.println("Decimal = " + decimal);
    }
}