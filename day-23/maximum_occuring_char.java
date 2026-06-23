import java.util.Scanner;

public class maximum_occuring_char
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string of your choice");
            String str=sc.nextLine();
            if(str.trim().isEmpty()){
                System.out.println("Error");
                return;
            }
            int max=0;
            char maxch=0;
            str=str.trim().toUpperCase();
            for(char ch='A';ch<='Z';ch++)
            {
                int count=0;
                for(int i=0;i<str.length();i++)
                {
                    char c=str.charAt(i);
                    if(ch==c)
                    {
                        count++;
                    }
                }
                if(count>0)
                {
                    if(count>max){
                        max=count;
                        maxch=ch;
                }
                    
            }
        }
        System.out.println("Character with maximum frequency "+max+" is "+maxch);
    }
}
}
        
    
    

