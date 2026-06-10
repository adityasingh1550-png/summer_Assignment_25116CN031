import java.util.Scanner;

public class numberpyramid
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)//for rows
        {
            for(int k=1;k<=row-i;k++)//for spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }
    }