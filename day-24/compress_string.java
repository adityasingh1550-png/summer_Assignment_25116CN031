import java.util.Scanner;

public class compress_string
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string of your choice");
        String str=sc.nextLine().trim();
        str=str.replace(" ","");
        String compress="";int count=1;
        if(str.trim().isEmpty())
        {
            System.out.println("The string is empty");
            return;
        }
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
                count++;
            else
            {
            compress+=str.charAt(i)+""+count;
            count=1;
            }}
            compress+=str.charAt(str.length()-1)+""+count;
        System.out.println("Compressed string is "+compress);
        }
    }
