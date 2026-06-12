import java.util.Scanner;
public class fibonacci
{
    int n;
    void getnum(int m)
    {
        n=m;
    }
    void fibonacci1()

    {
        int a=0;
        int b=1;
        int c;
        System.out.print(a+ " "+b+" ");
        for(int i=1;i<=n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(+c+" ");
        }
    }
        
    public static void main(String args[])
    {
        fibonacci ob=new fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms of your choice");
        int digi=sc.nextInt();    
        ob.getnum(digi);
        ob.fibonacci1();
        sc.close();
    }
    }

    