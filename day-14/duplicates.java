import java.util.Scanner;

public class duplicates
{
    int n;
    int[] a;
    int[] temp;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        a=new int [n];
        temp=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }
    void duplicate(int[] b)
    {
        int index=0;//to store index of temp[]
        int k=0;//count the duplicate
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=i+1;j<n;j++)
                {
            if(b[i]==b[j])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            temp[index++]=b[i];
        }
        else
            k++;
    }
    System.out.println("Number of duplicate elements are "+k);
    System.out.println("Array after removing duplicates");
    for(int i=0;i<index;i++)
    {
        System.out.print(temp[i]+" ");
    }
    }
    void display()
    {
        System.out.println("\nThe elements of array are ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        duplicates ob=new duplicates();
        ob.input();
        ob.duplicate(ob.a);
        ob.display();
        sc.close();
    }
}
        
    