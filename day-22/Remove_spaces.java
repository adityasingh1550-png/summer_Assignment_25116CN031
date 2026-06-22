import java.util.Scanner;

public class Remove_spaces
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of your choice");
        String str=sc.nextLine();
        str=str.trim();
        if(str.isEmpty()==true)
        {
            System.out.println("The string is empty");
            return;
        }
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
                result=result+ch;
        }
        System.out.println("String without spaces is "+result);
    }
        
    }
