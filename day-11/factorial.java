import java.util.Scanner;

public class factorial
{
    int n;
    void getnum()
    {
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
    }
    void factorial1()
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of a number "+f);

    }
    public static void main(String[] args)
    {
        factorial ob=new factorial();
        ob.getnum();
        ob.factorial1();
    }
}

