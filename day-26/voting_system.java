import java.util.Scanner;

public class voting_system
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of voters whose data is to stored");
        int n=sc.nextInt();
        sc.nextLine();
        int eligiblecount=0,noteligiblecount=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name");
            String name=sc.nextLine();
            if(name.trim().isEmpty()){
                System.out.println("Name error");
                break;}
            System.out.println("Enter the age");
            int age=sc.nextInt();
            if(age<0||age>120){
                System.out.println("Age error");
                break;}
            sc.nextLine();
            System.out.println("Enter the citizenship");
            String citizen=sc.nextLine();
            System.out.println("Enter the availability of voetr id");
            char voterid=sc.next().charAt(0);
            sc.nextLine();
            if(age>=18&&age<=120)
            {
                if(citizen.equalsIgnoreCase("Indian"))
                {
                    if(voterid=='Y'||voterid=='y')
                    {
                    System.out.println("Eligible");
                    eligiblecount++;
                    }
                    else{
                        System.out.println(" Not Eligible");
                        noteligiblecount++;
                        }}
                        else
                        {
                        System.out.println(" Not Eligible");
                        noteligiblecount++;
                        }
                        }
                        else
                        {
                            System.out.println(" Not Eligible");
                        noteligiblecount++;
                        }
                        }
                        System.out.println("Total eligible voters are "+eligiblecount);
                        System.out.println("Total non eligible voters are "+noteligiblecount); }}
    
