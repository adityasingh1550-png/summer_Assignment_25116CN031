import java.util.Scanner;

public class RecursiveReverse {

    static int rev = 0;

    static void reverse(int n) {
        if (n == 0)
            return;

        rev = rev * 10 + n % 10;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverse(n);

        System.out.println("Reversed Number = " + rev);
    }
}