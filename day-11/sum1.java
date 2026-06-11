import java.util.Scanner;

public class sum1
{
    int a,b=0;
    void getnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        sc.close();
    }
    void getsum()
    {
        int sum=0;
        sum=a+b;
        System.out.println("Sum of two numbers "+sum);
    }
     public static void main(String[] args)
    {
    sum1 ob=new sum1();
    ob.getnum();
    ob.getsum();
}
}