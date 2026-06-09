import java.util.Scanner;

public class repeatedcharacterpattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last character in capital only");
        char ch=sc.next().charAt(0);
        
        for(char i='A';i<=ch;i++)
        {
            for(char j=1;j<=(i-'A'+1);j++)
            {
                System.out.print(i);

            }
            
            System.out.println();
        }
        sc.close();
        
    }
}