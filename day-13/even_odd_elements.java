import java.util.Scanner;

public class even_odd_elements
{
    int n;
    int[] a;
    int ce,co;//to read odd and even elements
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
    void even_odd_elements1()
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                ce++;
            else
                co++;
        }
    }
    void display()
    {
        even_odd_elements1();
        System.out.println("No. of even elements "+ce+" and odd elements are "+co);
    }
    public static void main(String args[])
    {
        even_odd_elements ob=new even_odd_elements();
        ob.input();
        ob.display();
    }

}