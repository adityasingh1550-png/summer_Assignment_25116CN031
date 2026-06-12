import java.util.Scanner;

public class palindrome
{
    int num,rev,temp;
    void getnum(int m)
    {
        num=m;
        temp=m;
    }
    void palindrome1()
    {
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
    }
    void display()
    {
        System.out.println("Palaindrome of "+temp+" is "+rev);

    }
     
    public static void main(String args[])
    {
        palindrome ob=new palindrome();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of your choice");
        int digi=sc.nextInt();    
        ob.getnum(digi);
        ob.palindrome1();
        ob.display();
        sc.close();
    }
    }
