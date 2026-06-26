import java.util.Scanner;

public class number_guessing_game
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum value");
        int max=sc.nextInt();
        System.out.println("Enter the minimum value");
        int min=sc.nextInt();
        if (min > max) {
    System.out.println("Invalid range");
    return;}
        System.out.println("Guess the number between " + min + " and " + max);
        int guess=0;
        int num=(int)(Math.random()*(max-min+1))+min;
        while(guess!=num)
        {
            System.out.println("Enter guess");
            guess=sc.nextInt();
            if(guess<num)
                System.out.println("Too Low");
            else if(guess>num)
                System.out.println("Too high");
            else
                System.out.println("Right guess");
        }
}
}