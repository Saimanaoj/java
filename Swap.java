import java.util.Scanner;
class Swap
{
public static void main(String arg[])
{
System.out.println("enter the values of x and y");
Scanner sc=new Scanner(System.in);
int x= sc.nextint();
int y=sc.nextint();
x=x+y;
y=x-y;
x=x-y;
System.out.println("after swapping"+x+" " +y);
}
}
