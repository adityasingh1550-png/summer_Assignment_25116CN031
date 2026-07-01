import java.io.*;
import java.util.Scanner;

class Bank_accounts
{
    int account_number;
    String accountholdername;
    double balance;
    int pin;
    String[] history = new String[50];
    int historyCount = 0;
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
        addHistory("Deposited ₹" + amount);
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
        addHistory("Withdrawn ₹" + amount);
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
        
    }
    void addHistory(String msg)
{
    if(historyCount < 50)
    {
        history[historyCount++] = msg;
    }
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
        if(index!=-1){
        accounts[index].deposit(amount);
    }
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
    int findAccountByNumber(int accNo)
{
    for(int i = 0; i < count; i++)
    {
        if(accounts[i].account_number == accNo)
        {
            return i;
        }
    }
    return -1;
}
    void transferMoney(int fromAcc, int pin, int toAcc, double amount)
{
    int senderIndex = findAccount(fromAcc, pin);
    int receiverIndex = findAccountByNumber(toAcc);

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
    accounts[senderIndex].addHistory("Transferred ₹" + amount +" to A/C " + toAcc);
    accounts[receiverIndex].addHistory("Received ₹" + amount +" from A/C " + fromAcc);

    System.out.println("Transfer Successful.");
}
void checkBalance(int accNo, int pin)
{
    int index = findAccount(accNo, pin);

    if(index != -1)
    {
        System.out.println("Current Balance: ₹" +
        accounts[index].balance);
    }
    else
    {
        System.out.println("Invalid Account Number or PIN");
    }
}
void changePin(int accNo, int oldPin, int newPin)
{
    int index = findAccount(accNo, oldPin);

    if(index != -1)
    {
        accounts[index].pin = newPin;
        System.out.println("PIN Changed Successfully");
    }
    else
    {
        System.out.println("Invalid Account Number or PIN");
    }
}
void deleteAccount(int accNo, int pin)
{
    int index = findAccount(accNo, pin);

    if(index == -1)
    {
        System.out.println("Account Not Found");
        return;
    }

    for(int i=index;i<count-1;i++)
    {
        accounts[i] = accounts[i+1];
    }

    accounts[count-1] = null;
    count--;

    System.out.println("Account Deleted Successfully");
}
void showHistory(int accNo,int pin)
{
    int index = findAccount(accNo,pin);

    if(index == -1)
    {
        System.out.println("Account Not Found");
        return;
    }

    if(accounts[index].historyCount == 0)
    {
        System.out.println("No Transactions Found");
        return;
    }

    System.out.println("===== TRANSACTION HISTORY =====");

    for(int i=0;i<accounts[index].historyCount;i++)
    {
        System.out.println(accounts[index].history[i]);
    }
}
void generateReport()
{
    if(count == 0)
    {
        System.out.println("No Accounts");
        return;
    }

    double total = 0;

    int richest = 0;

    for(int i=0;i<count;i++)
    {
        total += accounts[i].balance;

        if(accounts[i].balance >
        accounts[richest].balance)
        {
            richest = i;
        }
    }

    System.out.println("Total Accounts: " + count);
    System.out.println("Total Bank Balance: ₹" + total);

    System.out.println(
    "Highest Balance Holder: " +
    accounts[richest].accountholdername);
}
void saveToFile()
{
    try
    {
        BufferedWriter bw =
        new BufferedWriter(
        new FileWriter("accounts.txt"));

        for(int i=0;i<count;i++)
        {
            bw.write(
            accounts[i].account_number + "," +
            accounts[i].accountholdername + "," +
            accounts[i].balance + "," +
            accounts[i].pin);

            bw.newLine();
        }

        bw.close();

        System.out.println(
        "Data Saved Successfully");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
void loadFromFile()
{
    try
    {
        BufferedReader br =
        new BufferedReader(
        new FileReader("accounts.txt"));

        String line;

        count = 0;

        while((line = br.readLine()) != null)
        {
            String[] data =
            line.split(",");

            create_account(
            Integer.parseInt(data[0]),
            data[1],
            Double.parseDouble(data[2]),
            Integer.parseInt(data[3]));
        }

        br.close();

        System.out.println(
        "Data Loaded Successfully");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
    public class BankManagementSystemEnhanced
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
            System.out.println("6. Check Balance");
            System.out.println("7. Change PIN");
            System.out.println("8. Delete Account");
            System.out.println("9. Transaction History");
            System.out.println("10. Reports");
            System.out.println("11. Save Data To File");
            System.out.println("12. Load Data From File");
            System.out.println("13. Exit");
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
                    break;
                case 6:
                    System.out.print("Enter Account Number: ");
                    int acc = sc.nextInt();

                    System.out.print("Enter PIN: ");
                    int pin5= sc.nextInt();
                    bank.checkBalance(acc, pin5);
                    break;
                case 7:
                    System.out.print("Enter Account Number: ");
                    int ac = sc.nextInt();

                    System.out.print("Enter old PIN: ");
                    int oldpin= sc.nextInt();
                    System.out.print("Enter new PIN: ");
                    int newpin= sc.nextInt();

                    bank.changePin(ac,oldpin,newpin);
                    break;
                case 8:
                    System.out.print("Enter Account Number to be deleted: ");
                    int delac = sc.nextInt();

                    System.out.print("Enter PIN: ");
                    int delpin= sc.nextInt();
                    bank.deleteAccount(delac, delpin);
                    break;
                case 9:
                    System.out.print("Enter Account Number: ");
                    int hAcc = sc.nextInt();

                    System.out.print("Enter PIN: ");
                    int hPin = sc.nextInt();

                    bank.showHistory(hAcc, hPin);
                break;
                case 10:
                    bank.generateReport();
                    break;

                case 11:
                    bank.saveToFile();
                    break;

                case 12:
                    bank.loadFromFile();
                break;

                case 13:
                    System.out.println("Thank you for using Bank Management System");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice!=13);
    
        sc.close();
    }
}