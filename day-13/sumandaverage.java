import java.util.Scanner;

public class sumandaverage
{
    int n;
    int[] a;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
    }
    void sumandaverage1()
    {
        float avg=0.0f;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=(float)sum/n;
        System.out.println("Sum of array elements are "+sum+" Average is " +avg);

    }
    
    public static void main(String args[])
    {
        sumandaverage ob=new sumandaverage();
        ob.input();
        ob.sumandaverage1();
        
    }

}