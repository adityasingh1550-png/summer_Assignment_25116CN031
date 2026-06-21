import java.util.Scanner;

public class count_vowels_consonants
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    String str1="AEIOUaeiou";
    int cc=0,cv=0;
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(str1.indexOf(ch)==-1)
            cc++;
        else
            cv++;
    }
    System.out.println("Number of vowels in string "+str+" is "+cv+" and consonants is "+cc);
}
}