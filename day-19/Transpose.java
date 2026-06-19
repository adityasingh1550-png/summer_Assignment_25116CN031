import java.util.Scanner;

public class Transpose
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
    void transpose()
    {
        System.out.println("The elements of matrix after transposing are ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)

                {
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Transpose ob=new Transpose();
        ob.input();
        ob.display();
        ob.transpose();
    }
}