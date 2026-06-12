import java.util.Scanner;

public class perfect
{
    int n;
    void getnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of your choice");
        n=sc.nextInt();
        sc.close();
    }
    void perfect1()
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum+=i;
        }
        if(sum==n)
            System.out.println("Number is perfect");
        else
            System.out.println("Number is not perfect");
    }
    public static void main(String args[])
    {
        perfect ob=new perfect();
        ob.getnum();
        ob.perfect1();
        
    }
}