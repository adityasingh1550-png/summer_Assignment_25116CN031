import java.util.Scanner;

public class convert_lower_uppercase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string in full uppercase or in lowercase");
        String str=sc.nextLine();
        
        if(str.length()==0)
            return;
        if((int)str.charAt(0)>=65&&(int)str.charAt(0)<=90)
        {
            str=str.toLowerCase();
            System.out.println("String in lowercase is "+str);
        }
        else
        {
            str=str.toUpperCase();
            System.out.println("String in uppercase is "+str);
        }
    }
}