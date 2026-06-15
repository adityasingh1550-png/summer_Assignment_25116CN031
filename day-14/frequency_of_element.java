import java.util.Scanner;

public class frequency_of_element
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
    void frequency(int[] b,int key,int f)
    {
        for(int i=0;i<n;i++)
        {
            if(b[i]==key)
                f++;
        }
        System.out.println("Element "+key+" has frequency "+f);
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
        frequency_of_element ob=new frequency_of_element();
        ob.input();
        System.out.println("Enter the element which frequency you want to know");
        int keyy=sc.nextInt();
        int f=0;
        ob.frequency(ob.a,keyy,f);
        ob.display();
    }
}
        
    