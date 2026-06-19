import java.util.Scanner;

public class Subtract_matrices
{
    int n;
    int m;
    int[][] arr1;
    int [][] arr2;
    int[][] arr;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row of matrices");
        n=sc.nextInt();
        System.out.println("Enter the size of column of matrices");
        m=sc.nextInt();
        arr1=new int[n][m];
        arr=new int[n][m];
        System.out.println("Enter the elements in first matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        arr2=new int[n][m];
        System.out.println("Enter the elements in second matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        System.out.println("The elements of matrix1 are ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)

                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
        }
        System.out.println("The elements of matrix2 are ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)

                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
        }
    }
    void subtract_matrices()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        System.out.println("After subtracting matrices");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Subtract_matrices ob=new Subtract_matrices();
        ob.input();
        ob.display();
        ob.subtract_matrices();
    }
}