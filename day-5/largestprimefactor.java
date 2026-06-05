import java.util.Scanner;

public class largestprimefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int largest = -1;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                largest = i;
                num /= i;
            }
        }

        System.out.println("Largest Prime Factor = " + largest);
        sc.close();
    }
}
