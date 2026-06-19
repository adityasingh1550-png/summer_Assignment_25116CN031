import java.util.Scanner;

public class Diagonal_sum
{
    int n;
    int m;
    int[][] arr;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row of matrices");
        n=sc.nextInt();
        System.out.println("Enter the size of column of matrices");
        m=sc.nextInt();
        arr=new int[n][m];
        System.out.println("Enter the elements in matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
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
            for(int j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
        }
    }
    void sum()
    {
    if(n != m)
    {
        System.out.println("Diagonal sum can be calculated only for square matrices.");
        return;
    }
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i < n; i++)
    {
        sum1 += arr[i][i];
        sum2 += arr[i][n - 1 - i];
    }
    System.out.println("Sum of left diagonal is " + sum1);
    System.out.println("Sum of right diagonal is " + sum2);
}
    public static void main(String[] args)
    {
        Diagonal_sum ob=new Diagonal_sum();
        ob.input();
        ob.display();
        ob.sum();
    }
}
