import java.util.Scanner;

public class reverse_array
{
    int n;
    int[] ar;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        ar=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    void swap(int[] b,int start,int end)
    {
        int temp=b[start];
        b[start]=b[end];
        b[end]=temp;
    }
    void reverse()
    {
        int start=0;
        int end=n-1;
        while(start<end)
        {
        swap(ar,start,end);
        start++;
        end--;
        }
        System.out.println("\nArray after reversing is");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
    void display()
    {
        System.out.println("The elements of array are ");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
    public static void main(String args[])
    {
        reverse_array ob=new reverse_array();
        ob.input();
        ob.display();
        ob. reverse();
    }}
