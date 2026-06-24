import java.util.Scanner;

public class duplicate_characters
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of your choice");
        String str=sc.nextLine().toUpperCase().trim();
        str=str.replace(" ","");
        if(str.isEmpty())
        {
            System.out.println("The entered string is empty");
            return;
        }
        String unique="";
        for(int i=0;i<str.length();i++)
        {
            if(unique.indexOf(str.charAt(i))==-1)
            {
                unique=unique+str.charAt(i);
            }
        }
        System.out.println("String after removing duplicates "+unique);
    }
}