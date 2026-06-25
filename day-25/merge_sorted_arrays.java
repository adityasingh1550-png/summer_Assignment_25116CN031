import java.util.Arrays;
import java.util.Scanner;

public class merge_sorted_arrays
{
    int arr[];
    int arr1[];
    int arr2[];
    int s1;
    int s2;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        s1=sc.nextInt();
        System.out.println("Enter the size of array 2");
        s2=sc.nextInt();
        arr1=new int[s1];
        arr2=new int[s2];
        arr=new int[s1+s2];
        System.out.println("Enter the elements in the array 1");
        for(int i=0;i<s1;i++)
            arr1[i]=sc.nextInt();
        System.out.println("Enter the elements in the array 2");
        for(int i=0;i<s2;i++)
            arr2[i]=sc.nextInt();
    }
    void merge()
    {
        
        for(int i=0;i<s1;i++)
            arr[i]=arr1[i];
        for(int i=0,j=s1;i<s2;i++,j++)
            arr[j]=arr2[i];
    }
    void sort()
    {
        Arrays.sort(arr);
    }
    void display()
    {
        System.out.println("Array after merging is");
        for(int i=0;i<s1+s2;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        merge_sorted_arrays ob=new merge_sorted_arrays();
        ob.input();
        ob.merge();
        ob.sort();
        ob.display();
    }
}
