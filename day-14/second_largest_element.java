import java.util.Scanner;

public class second_largest_element
{
    int n;
    int[] ar;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        ar=new int [n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        sc.close();
    }
    void largestsecond()
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        int max2=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]>max2&&ar[i]<max)
            {
                max2=ar[i];
            }
        }
        System.out.println("Second largest element in the array "+max2);
    }
    void display()
    {
        System.out.println("The elements of array are ");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
    public static void main(String[] args)
    {
        second_largest_element ob=new second_largest_element();
        ob.input();
        ob.largestsecond();
        ob.display();
    }
}
