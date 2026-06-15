import java.util.Scanner;

public class linearsearch
{
    int n;
    int[] a;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        a=new int [n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }
    void linearsearch1(int[] b,int key,int p)
    {
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(b[i]==key)
            {
                flag=1;
                p=i+1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Element found at position "+p);
        else
            System.out.println("Error___\nElement not found");
    }
    void display()
    {
        System.out.println("The elements of array are ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        linearsearch ob=new linearsearch();
        ob.input();
        System.out.println("Enter the element to be searched");
        int keyy=sc.nextInt();
        int po=0;
        ob.linearsearch1(ob.a,keyy,po);
        ob.display();
    }
}