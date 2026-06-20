import java.util.Scanner;

public class Symmetric
{
    int n;
    int[][] arr;
    int[][] arr2;
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
        arr2=new int[n][n];
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
    void symmetric()
    {
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) 
            {
                arr2[i][j]=arr[j][i];
            }
            }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) 
            {
                if(arr2[i][j]!=arr[i][j])
                {
                    flag=1;
                    break;
                }
                
            }
            }
            if(flag==0)
                System.out.println("The matrix is symmetric");
            else
                System.out.println("The matrix is not symmetric");
        }
        public static void main(String[] args)
        {
            Symmetric ob=new Symmetric();
            ob.input();
            ob.display();
            ob.symmetric();
            
        }
        }