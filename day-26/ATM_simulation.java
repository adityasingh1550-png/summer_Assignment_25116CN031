import java.util.Scanner;

public class ATM_simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 5000;
        int choice=0;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Invalid PIN");
            return;
        }
        while(choice!=4)
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if(balance>0)
                    System.out.println("Current Balance: ₹" + balance);
                else
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit Successful");
                        System.out.println("New Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid Amount");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid Amount");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient Balance");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful");
                        System.out.println("Remaining Balance: ₹" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}