import java.util.Scanner;

public class String_without_function
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=sc.nextLine();
    int c=0;
    char[] str1=str.toCharArray();
    for(int i=0;i<str1.length;i++)
    {
        c++;
    }
    System.out.println("Length of string "+str+" is "+c);
}
}