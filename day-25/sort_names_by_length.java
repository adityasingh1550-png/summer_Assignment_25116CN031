import java.util.Scanner;

public class sort_names_by_length
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("enter the  size of array");
        n=sc.nextInt();
        sc.nextLine();
        String names[]=new String[n];
        System.out.println("Enter the names in the array");
        for(int i=0;i<n;i++)
        {
            names[i]=sc.nextLine();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((names[i].length()) > (names[j].length())||(names[i].length()) == (names[j].length())&&(names[i].compareToIgnoreCase(names[j])>0))
                {
                    String temp=names[j];
                    names[j]=names[i];
                    names[i]=temp;
                }
            }
        }
        System.out.println("Names after sorting by length");
        for(int i=0;i<n;i++)
        {
            System.out.print(names[i]+" ");
        }
    }
}