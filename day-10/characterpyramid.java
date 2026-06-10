import java.util.Scanner;

public class characterpyramid
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
            for(char j='A';j<('A'+i);j++)//for first increasing characters
            {
                System.out.print((char)j);
            }
            for(int l='A'+i-2;l>='A';l--)//for last decreasing characters
                System.out.print((char)l);
            System.out.println();
}
sc.close();
    }
}
            
