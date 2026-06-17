import java.util.Scanner;

public class common_elements
{
    int n1,n2;
    int[] a1;
    int[] a2;
    int[] a3;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        n1=sc.nextInt();
        System.out.println("Enter the size of 2nd array");
        n2=sc.nextInt();
        a1=new int[n1];
        a2=new int[n2];
        a3=new int[n1];
        System.out.println("Enter the elements in the 1st array");
        for(int i=0;i<n1;i++)
            a1[i]=sc.nextInt();
        System.out.println("Enter the elements in the 2nd array");
        for(int i=0;i<n2;i++)
            a2[i]=sc.nextInt();
    }
    void sort(int[] b,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(b[j]>b[j+1])
                {
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
    }
    void common_elements1()
    {
        sort(a1,n1);
        sort(a2,n2);
        int i=0;int j=0;
        int index=0;
        while(i<n1&&j<n2)
        {
            if(a1[i]==a2[j])
            {
                a3[index++]=a1[i];
                i++;
                j++;
            }
            else if(a1[i]<a2[j])
                i++;
            else
                j++;
        }
         System.out.println("Common elements are:");
         for(int k=0;k<index;k++)
            System.out.print(a3[k]+" ");
    }
    public static void main(String[] args) 
    {
        common_elements ob=new common_elements();
        ob.input();
        ob.common_elements1();
    }
}

