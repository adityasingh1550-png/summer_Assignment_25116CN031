import java.util.Arrays;
import java.util.Scanner;

public class anagram_string
{
String str;
String str2;
char[] strcp;
char[] strcp2;
void input()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string");
    str=sc.nextLine().toUpperCase();
    str=str.replace(" ","");
    System.out.println("Enter the second string");
    str2=sc.nextLine().toUpperCase();
    str2=str2.replace(" ","");
    strcp=str.toCharArray();
    strcp2=str2.toCharArray();
}
void Anagram()
{
    
    Arrays.sort(strcp);
    Arrays.sort(strcp2);
}
    

void display()
{
   
    if(Arrays.equals(strcp,strcp2))
        System.out.println("Anagram strings");
    else
         System.out.println("Not Anagram strings");
}
    
public static void main(String[] args) {
    anagram_string ob=new anagram_string();
    ob.input();
    if (ob.str.length() != ob.str2.length()) {
            System.out.println("Not anagram strings\nDiffrent lengths detected");
            return;
        }
    ob.Anagram();
    ob.display();

}
}

