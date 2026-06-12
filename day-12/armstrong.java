import java.util.Scanner;
public class armstrong
{
    int num;
    void getnum(int m)
    {
        num=m;
        
    }
    void armstrong1()
    {
        int temp1=num;
        int temp2=num;
        int sum=0;
       int count=0;
       if(num==0)
        System.exit(0);
       while(temp1>0)
        {
            count++;
            temp1=temp1/10;
        }
        while(temp2>0)
        {
            int rem=temp2%10;
            sum=sum+(int)Math.pow(rem,count);
            temp2=temp2/10;
        }
        if(num==sum)
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not armstrong");
    }
    public static void main(String args[])
    {
        armstrong ob=new armstrong();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of your choice");
        int digi=sc.nextInt();    
        ob.getnum(digi);
        ob.armstrong1();
        sc.close();
    }
    }