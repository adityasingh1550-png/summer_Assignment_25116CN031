import java.util.Scanner;

public class maximum
{
    int a,b,c=0;
    void getnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        System.out.println("Enter the third number");
        c=sc.nextInt();
        sc.close();
    }
    void getmax()
    {
        if(a>b&&a>c)
            System.out.println(a+ " is largest");
        else if(b>c&&b>a)
            System.out.println(b+ " is largest");
        else
            System.out.println(c+ " is largest");
    }
     public static void main(String[] args)
    {
    maximum ob=new maximum();
    ob.getnum();
    ob.getmax();
}
}