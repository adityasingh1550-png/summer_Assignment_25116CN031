import java.util.Scanner;

public class common_charcters_strings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String s1=sc.nextLine().toUpperCase().trim();
        System.out.println("Enter the string2");
        String s2=sc.nextLine().toUpperCase().trim();
        s1=s1.replace(" ","");
        s2=s2.replace(" ","");
        String common="";
        if(s1.trim().isEmpty())
        {
            System.out.println("Entered string is empty");
            return;
        }
        if(s2.trim().isEmpty())
        {
            System.out.println("Entered string is empty");
            return;
        }
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                    {
                        if(common.indexOf(s1.charAt(i))==-1){
                    common+=s1.charAt(i)+" ";
                    break;
                }
            }
        }}
        System.out.println("Common characters in the srtrings are "+common);
    }
}