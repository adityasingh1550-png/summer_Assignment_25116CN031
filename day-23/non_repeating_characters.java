import java.util.Scanner;

public class non_repeating_characters
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string of your choice");
            String str=sc.nextLine();
            str=str.trim().toUpperCase();
            if(str.trim().isEmpty()){
                System.out.println("error");
                return;
            }
            System.out.println("The first non repeating character");
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                int count=0;
                for(int j=0;j<str.length();j++)
                {
                    
                    char c=str.charAt(j);
                    if(ch==c)
                    {
                        count++;
                    }
                }
                if(count==1){
                    System.out.print(ch+" ");
                    return;
            }
        }
    }
}
}
        
    
    

