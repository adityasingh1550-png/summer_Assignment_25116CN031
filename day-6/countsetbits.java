import java.util.Scanner;

public class countsetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {
            count += num % 2;
            num /= 2;
        }

        System.out.println("Set Bits = " + count);
    }
}
