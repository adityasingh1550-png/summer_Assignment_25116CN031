import java.util.Scanner;

public class starpyramid
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
            for(int j=1;j<=((2*row)-(1+(row-i)*2));j++) //for stars
            {
                System.out.print("*");
            }
        System.out.println();
            

        }
        sc.close();
    }
}
