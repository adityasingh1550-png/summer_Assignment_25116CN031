import java.util.Scanner;

class StringOperations
{
    String str1, str2;

    StringOperations(String str1)
    {
        this.str1 = str1;
    }

    void findLength()
    {
        System.out.println("Length = " + str1.length());
    }

    void copyString()
    {
        str2 = str1;
        System.out.println("Copied String = " + str2);
    }

    void concatenate(Scanner sc)
    {
        System.out.print("Enter second string: ");
        str2 = sc.nextLine();
        String result = str1 + str2;
        System.out.println("Concatenated String = " + result);
    }

    void compare(Scanner sc)
    {
        System.out.print("Enter second string: ");
        str2 = sc.nextLine();

        if(str1.equals(str2))
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");
    }

    void reverse()
    {
        String rev = "";
        for(int i = str1.length() - 1; i >= 0; i--)
        {
            rev = rev + str1.charAt(i);
        }
        System.out.println("Reversed String = " + rev);
    }
}

public class MenuDrivenStringSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        StringOperations obj = new StringOperations(str1);

        int choice;

        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Find Length");
            System.out.println("2. Copy String");
            System.out.println("3. Concatenate Strings");
            System.out.println("4. Compare Strings");
            System.out.println("5. Reverse String");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice)
            {
                case 1:
                    obj.findLength();
                    break;

                case 2:
                    obj.copyString();
                    break;

                case 3:
                    obj.concatenate(sc);
                    break;

                case 4:
                    obj.compare(sc);
                    break;

                case 5:
                    obj.reverse();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 6);

        sc.close();
    }
}