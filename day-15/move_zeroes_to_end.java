import java.util.Scanner;

public class move_zeroes_to_end 
{
    int n;
    int[] arr;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void move_zeroes()
    {
        int j = 0; // position for next non-zero element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Array after moving zeroes to end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void display()
    {
        System.out.println("The elements of array are ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        move_zeroes_to_end  ob=new  move_zeroes_to_end();
        ob.input();
        ob.display();
        ob.move_zeroes();
    }

}

    

