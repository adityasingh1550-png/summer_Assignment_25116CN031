import java.util.Scanner;
 public class program_4 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int Number, Count=0; 
System.out.println("\n Please Enter any Number: ");
Number = sc.nextInt();

while (Number > 0) {
Number = Number / 10;
Count = Count + 1;}
System.out.format("\n Number of Digits in a Given Number %d", Count);
sc.close();
}
}
