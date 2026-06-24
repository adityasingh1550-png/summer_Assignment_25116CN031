import java.util.Scanner;

public class longest_word
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of your choice");
        String str=sc.nextLine();
        String[] words=str.split("\\s+");
        int maxlen=0;
        if(str.trim().isEmpty()==true)
            {
                    System.out.println("The number of words in a sentence are 0");
                    return;
            }
        for(String word:words)
        {
            if(word.length()>maxlen)
                maxlen=word.length();
        }
        System.out.println("Longest words");
        for(String word:words)
        {
            if(word.length()==maxlen)
                System.out.println(word);
        }
        System.out.println("Length of longest word "+maxlen);
    }
}
        