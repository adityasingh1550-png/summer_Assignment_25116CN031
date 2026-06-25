import java.util.Scanner;

public class common_characters_efficient
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        String s1 = sc.nextLine().toUpperCase().replace(" ", "");

        System.out.println("Enter the second string");
        String s2 = sc.nextLine().toUpperCase().replace(" ", "");

        if(s1.isEmpty() || s2.isEmpty())
        {
            System.out.println("Entered string is empty");
            return;
        }
        boolean[] present=new boolean[26];
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>='A'&&ch<='Z')
                present[ch-'A']=true;
        }
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            if(ch>='A'&&ch<='Z'&&present[ch-'A']==true)
            {
                System.out.print(ch+" ");
                present[ch-'A']=false;//remove duplicates
            }
        }
    }
}
