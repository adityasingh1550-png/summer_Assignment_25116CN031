import java.util.Scanner;

public class prime
{
    int n;
    void getnum()
    {
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the number");
        n=sc.nextInt();
    }
    void prime()
    {
        int flag=0;
        if(n==1||n==0)
        {
            System.out.println("It is neither prime nor composite");
            System.exit(0);
        }

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                {
                flag=1;
                break;
                }
            }
        if(flag==0)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    }
    public static void main(String[] args)
    {
        prime ob=new prime();
        ob.getnum();
        ob.prime();
    }
}

