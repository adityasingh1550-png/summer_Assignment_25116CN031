import java.util.Scanner;

public class Character_frequency
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string of your choice");
            String str=sc.nextLine();
            str=str.toUpperCase();
            for(char ch='A';ch<='Z';ch++)
            {
                int count=0;
                for(int i=0;i<str.length();i++)
                {
                    
                    char c=str.charAt(i);
                    if(ch==c)
                    {
                        count++;
                    }
                }
                if(count>0)
                    System.out.println("The frequency of character "+ch+" is "+count);
            }
        }
    }
}
        
    
    

