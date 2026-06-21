import java.util.Scanner;

public class Reverse_string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String revstr="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            revstr=ch+revstr;
        }
        System.out.println("Reverse of "+str+" is "+revstr);
    }
}
