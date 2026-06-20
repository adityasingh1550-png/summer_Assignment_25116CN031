import java.util.Scanner;

public class Multiply_matrices
{
    int r1,r2;
    int c1,c2;
    int[][] arr1;
    int [][] arr2;
    int[][] arr;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row of matrix1");
        r1=sc.nextInt();
        System.out.println("Enter the size of column of matrix1");
        c1=sc.nextInt();
        arr1=new int[r1][c1];
        System.out.println("Enter the size of row of matrix2");
        r2=sc.nextInt();
        System.out.println("Enter the size of column of matrix2");
        c2=sc.nextInt();
        arr2=new int[r2][c2];
        System.out.println("Enter the elements in first matrix");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        arr2=new int[r2][c2];
        System.out.println("Enter the elements in second matrix");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        arr=new int[r1][c2];
    }
    void multiply()
    {
        if(c1!=r2)
            {System.out.println("Matrix multiplication not possible");
            return;
            }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    arr[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Matrix after multiplication is");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }}
    void display()
    {
        System.out.println("The elements of matrix1 are ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)

                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
        }
        System.out.println("The elements of matrix2 are ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)

                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
        }
    }
    public static void main(String args[])
    {
        Multiply_matrices ob=new Multiply_matrices();
        ob.input();
        ob.display();
        ob.multiply();
    }
}
