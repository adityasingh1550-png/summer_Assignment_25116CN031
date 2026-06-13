import java.util.Scanner;

public class largestsmallest
{
    int n;int max,min;
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
    }
    void largestsmallest1()
    {
        max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
    }
    void display()
    {
        largestsmallest1();
        System.out.println("The largest "+max+" and smallest element "+min+" of array");
        
    }
    public static void main(String args[])
    {
        largestsmallest ob= new largestsmallest();
        ob.input();
        ob.display();
    }

}