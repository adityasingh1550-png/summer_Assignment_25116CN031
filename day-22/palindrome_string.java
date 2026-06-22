import java.util.Scanner;

public class palindrome_string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of your choice");
        String str=sc.nextLine();
        String revstr="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            revstr=ch+revstr;
        }
        if(revstr.equalsIgnoreCase(str))
            System.out.println("The entered string string "+str+" whose reverse is "+revstr+" is palindrome");
        else
            System.out.println("The entered string is not palindrome");
    }
}