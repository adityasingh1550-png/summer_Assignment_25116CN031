import java.util.Scanner;

public class sum_pair
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
            System.out.println("The elements of array are ");
            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
        }
        void sum_pair()
        {
            Scanner sc=new Scanner(System.in);
            if(n==0)
                System.exit(0);
            int sum=0;int f=0;
            System.out.println("\nEnter the sum to be found ");
            sum=sc.nextInt();
            System.out.println("The pairs are");
            for(int i=0;i<n;i++)
            {
                
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]+a[j]==sum)
                    {
                        f++;
                        System.out.print("("+a[i]+","+a[j]+") ");
                    }
                }
            }
            System.out.println("\nNumber of times this sum is found is "+f);
        }
        public static void main(String args[])
        {
            sum_pair ob=new sum_pair();
            ob.input();
            ob.display();
            ob.sum_pair();
        }}