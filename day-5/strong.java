import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}