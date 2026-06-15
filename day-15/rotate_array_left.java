import java.util.Scanner;

public class rotate_array_left
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
    void rotate()
    {
        int temp=ar[0];
        for(int i=0;i<n-1;i++)
            ar[i]=ar[i+1];
        ar[n-1]=temp;
        System.out.println("\nArray after roatating left");
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
        rotate_array_left ob=new rotate_array_left();
        ob.input();
        ob.display();
        ob.rotate();
    }

}