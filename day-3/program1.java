import java.util.*;
public class program1
{
// prime number check
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
int flag=0;
if(n==1||n==0)
{
    System.out.println("Number is neither prime nor composite");
    System.exit(n);
}
for(int i=2;i*i<n;i++) {
if(n%i==0) {
flag=1;
}
}
if(flag==1)
{
    System.out.println("number is not prime");
}
else{
System.out.println("number is prime");}
sc.close();
}
}
