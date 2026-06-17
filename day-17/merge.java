import java.util.Scanner;

public class merge
{
    void merge1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int n1=sc.nextInt();
        System.out.println("Enter the size of 2nd array");
        int n2=sc.nextInt();
        
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        int a3[]=new int[n1+n2];
        System.out.println("Enter the elements in the 1st array");
        for(int i=0;i<n1;i++)
            a1[i]=sc.nextInt();
        System.out.println("Enter the elements in the 2nd array");
        for(int i=0;i<n2;i++)
            a2[i]=sc.nextInt();
        for(int i=0;i<n1;i++)
            a3[i]=a1[i];
        for(int i=0,j=n1;i<n2;i++,j++)
            a3[j]=a2[i];
        System.out.println("Array after merging is");
        for(int i=0;i<n1+n2;i++)
            System.out.print(a3[i]+" ");
    }
    public static void main(String args[])
    {
        merge ob=new merge();
        ob.merge1();
    }
}