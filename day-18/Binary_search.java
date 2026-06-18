import java.util.Scanner;

public class Binary_search
{
    int[] arr;
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    void sort()
    {
        for(int i=0;i<n-1;i++)
        {
        for(int j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    }
    void search(int key)
    {
        int flag=0;
        int l=0;
        int u=n-1;
        int p=0;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(arr[mid]==key)
                {
                    flag=1;
                    p=mid+1;
                    break;
                }
            else if(arr[mid]<key)
                l=mid+1;
            else
                u=mid-1;
        }
        if(flag==1)
            System.out.println("Element found at position "+p);
        else
            System.out.println("Error 404\nElement not found");
    }
    

    public static void main(String[] args) 
    {
        Binary_search ob=new Binary_search();
        Scanner sc=new Scanner(System.in);
        ob.input();
        ob.sort();
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        ob.search(key);
    }
}
        
        