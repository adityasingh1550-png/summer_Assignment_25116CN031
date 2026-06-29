import java.util.Scanner;

class Bank_accounts
{
    int account_number;
    String accountholdername;
    double balance;
    int pin;
    Bank_accounts(int account_number,String accountholdername,double balance,int pin)
    {
        this.account_number=account_number;
        this.accountholdername=accountholdername;
        this.balance=balance;
        this.pin=pin;
    }
    void deposit(double amount)
    {
        if(amount>0)
        {
        balance=balance+amount;
        System.out.println("Money deposited successfully");
        }
        else
        {
            System.out.println("Invalid Amount: ");
        }
    }
    void withdraw(double amount)
    {
        if(amount<=balance){
        balance=balance-amount;
        System.out.println("Withdrawal successful");
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    void display()
    {
        System.out.println("Account number: "+account_number);
        System.out.println("Account Holder Name: "+accountholdername);
        System.out.println("Balance: "+balance);
        System.out.println();
    }
    }
    class Bank{
        Bank_accounts[] accounts;
        int count;
        Bank(int size)
        {
            accounts=new Bank_accounts[size];
            count=0;
        }
        void create_account(int accNo, String name, double balance,int pin)
        {
            if(count<accounts.length)
            {
                accounts[count]=new Bank_accounts( accNo, name, balance,pin);
                count++;
                System.out.println("Account created successfully");
            }
            else
            {
                System.out.println("Bank is full ");
            }
        }
        void displayall()
        {
            if (count == 0) {
            System.out.println("No Accounts Found.");
            return;
            }
        for (int i = 0; i < count; i++) {
            accounts[i].display();
        }
        }
        int findAccount(int accNo,int pin)
        {
        for (int i = 0; i < count; i++) {
            if (accounts[i].account_number == accNo&&accounts[i].pin==pin) {
                return i;
            }
        }
        return -1;
    }
    void depositmoney(int accontno,double amount,int pin)
    {
        int index=findAccount(accontno,pin);
        if(index!=-1)
        accounts[index].deposit(amount);
        else
        System.out.println("Account Not Found.");
    }
    void withdrawMoney(int accNo, double amount,int pin) {
        int index = findAccount(accNo,pin);
        if (index != -1) {
            accounts[index].withdraw(amount);
        } else {
            System.out.println("Account Not Found.");
    }}
    void transferMoney(int fromAcc, int pin, int toAcc, double amount)
{
    int senderIndex = findAccount(fromAcc, pin);
    int receiverIndex = findAccount(toAcc,pin);

    if(senderIndex == -1)
    {
        System.out.println("Invalid Sender Account or PIN.");
        return;
    }

    if(receiverIndex == -1)
    {
        System.out.println("Receiver Account Not Found.");
        return;
    }

    if(accounts[senderIndex].balance < amount)
    {
        System.out.println("Insufficient Balance.");
        return;
    }

    accounts[senderIndex].balance -= amount;
    accounts[receiverIndex].balance += amount;

    System.out.println("Transfer Successful.");
}
}
    public class Bank_account_management_system
    {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the number of account holders");
        int size=sc.nextInt();
        Bank bank=new Bank(size);
        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    System.out.println("Enter the pin");
                    int pin=sc.nextInt();
                    bank.create_account(accNo, name, bal,pin);
                    break;

                case 2:
                    bank.displayall();
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    System.out.print("Enter Amount to Deposit: ");
                    double dep = sc.nextDouble();

                    System.out.println("Enter the pin");
                    int pin2=sc.nextInt();

                    bank.depositmoney(accNo, dep,pin2);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    System.out.print("Enter Amount to Withdraw: ");
                    double wd = sc.nextDouble();
                    System.out.println("Enter the pin");
                    int pin3=sc.nextInt();

                    bank.withdrawMoney(accNo, wd,pin3);
                    break;
                
                case 5:
                    System.out.print("Enter Sender Account Number: ");
                    int sender = sc.nextInt();

                    System.out.print("Enter PIN: ");
                    int pin4= sc.nextInt();

                    System.out.print("Enter Receiver Account Number: ");
                    int receiver = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    bank.transferMoney(sender, pin4, receiver, amount);

                case 6:
                    System.out.println("Thank you for using Bank System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice!=6);
    
        sc.close();
    }
}

