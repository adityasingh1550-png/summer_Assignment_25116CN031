import java.util.Scanner;

public class first_repeating_character
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
            for(int i=0;i<str.length();i++)
            {
                int count=0;
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        count++;
                    }
                }
                if(count>1){
                    System.out.print("The first repeating character\n"+str.charAt(i));
                    return;}
                
                }
                System.out.println("No repeating character");
        }
    }
}

