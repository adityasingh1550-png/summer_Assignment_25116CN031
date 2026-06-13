import java.util.Scanner;

public class inputanddisplayarray
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
    }
    void display()
    {
        System.out.println("The elements of array are ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String args[])
    {
        inputanddisplayarray ob=new inputanddisplayarray();
        ob.input();
        ob.display();
    }

}