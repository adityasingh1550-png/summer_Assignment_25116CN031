import java.util.Scanner;

public class count_words_in_string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of your choice");
        String str=sc.nextLine();
        str=str+" ";
        int count=0;
         if(str.trim().isEmpty()==true)
            {
                    System.out.println("The number of words in a sentence are 0");
                    return;
            }
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' '&&str.charAt(i-1)!=' ')
                count++;
        }
        System.out.println("The number of words in a sentence are "+count);
    }
}