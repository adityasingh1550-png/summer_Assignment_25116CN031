import java.util.Scanner;

public class union
{
    int n1,n2;
    int[] a1;
    int[] a2;
    int[] a3;
    void merge1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        n1=sc.nextInt();
        System.out.println("Enter the size of 2nd array");
        n2=sc.nextInt();
        a1=new int[n1];
        a2=new int[n2];
        a3=new int[n1+n2];
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
    void duplicate()
    {
        merge1();
        int[] b=new int[n1+n2];
    int index=0;
    for(int i=0;i<n1+n2;i++)
    {
        int flag=0;
        for(int j=i+1;j<n1+n2;j++)
        {
            if(a3[i]==a3[j])
            {
                flag=1;
                break;
            }
                
        }
        if(flag==0)
        {
            b[index++]=a3[i];
        }
    }
    System.out.println("\nUnion of array is ");
    for(int i=0;i<index;i++)
        System.out.print(b[i]+" ");
    }
    public static void main(String args[])
    {
        union ob=new union();
        ob.duplicate();
        
    }
}