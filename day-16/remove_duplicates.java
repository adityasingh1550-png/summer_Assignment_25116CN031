import java.util.Scanner;

public class remove_duplicates
{
    int n;
    int[] a;
    int[] b;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        a=new int[n];
        b=new int[n];
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
    void duplicate()
{
    int index=0;
    for(int i=0;i<n;i++)
    {
        int flag=0;
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                flag=1;
                break;
            }
                
        }
        if(flag==0)
        {
            b[index++]=a[i];
        }
    }
    System.out.println("\nArray after removing duplicates is ");
    for(int i=0;i<index;i++)
        System.out.print(b[i]+" ");
}
    public static void main(String args[])
    {
        remove_duplicates ob=new remove_duplicates();
        ob.input();
        ob.display();
        ob.duplicate();
    }
}