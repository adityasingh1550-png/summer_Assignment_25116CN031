import java.util.Scanner;

public class missing_number
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
        System.out.println("The elements of original array are ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    void missing(int[] b)
    {
        System.out.println("\nMissing dgits are ");
        for(int i=0;i<=9;i++)
        {
            int found=0;
            for(int j=0;j<n;j++)
            {
                if(b[j]==i)
                {
                    found=1;
                    break;
                }
            }
            if(found==0)
                System.out.print(i+" ");
        }
    }
    public static void main(String args[])
    {
        missing_number ob=new missing_number();
        ob.input();
        ob.display();
        ob.missing(ob.a);
    }
}