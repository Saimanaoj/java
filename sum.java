import java.util.Scanner;
class sum
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n,sum=0,rem;
n=sc.nextInt();
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("sum of digit is "+sum);
}
}
