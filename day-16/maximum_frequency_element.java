import java.util.Scanner;

public class maximum_frequency_element
{
    int n;
    int[] a;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void display()
    {
        if(n==0)
            System.exit(0);
        System.out.println("The elements of array are ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    void frequency()
    {
        if(n==0)
            System.exit(0);
        int max=Integer.MIN_VALUE;int ele=0;
        for(int i=0;i<n;i++)
        {
            int f=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    f++;
                }
            }
            if(f>max)
            {
                max=f;
                
            }
        }
        System.out.println("\nElements with maximum frequency:");

for(int i = 0; i < n; i++)
{
    int f = 1;

    for(int j = i + 1; j < n; j++)
    {
        if(a[i] == a[j])
            f++;
    }

    if(f == max)
        System.out.println(a[i]+" ");
}
System.out.println("Whose frequency is "+max);      
    }
    public static void main(String args[])
    {
        maximum_frequency_element ob=new maximum_frequency_element();
        ob.input();
        ob.display();
        ob.frequency();
    }
}