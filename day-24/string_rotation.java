import java.util.Scanner;

public class string_rotation
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String first=sc.next();
        System.out.println("Enter the second string");
        String second=sc.next();
        String temp=first+first;
        boolean found=false;
        if (first.length() != second.length()) {
            System.out.println("Not a string rotation");
            return;
        }
        for(int i=0;i<=temp.length()-second.length();i++)
        {
            int j=0;
            for(j=0;j<second.length();j++)
            {
                if(temp.charAt(i+j)!=second.charAt(j))
                    break;
            }
            if(j==second.length())
            {
                found=true;
                break;
            }
        }
        if(found)
            System.out.println("It an string rotation");
        else
            System.out.println("It not an string rotation");
    }
}