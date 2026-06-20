import java.util.Scanner;

public class Column_wise_sum
{
    int n;
    int[][] arr;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row and column of square matrices");
        n=sc.nextInt();
        arr=new int[n][n];
        System.out.println("Enter the elements in matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
    }
    void display()
    {
        System.out.println("The elements of matrix are ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)

                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
        }
    }
    void sum()
    {
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=arr[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" is "+sum);
        }
    }
     public static void main(String args[])
    {
        Column_wise_sum ob=new Column_wise_sum();
        ob.input();
        ob.display();
        ob.sum();
    }
}