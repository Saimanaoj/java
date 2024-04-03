import java.util.Scanner;
class Addition
{
    public static void main(String arg[])
     {
           Scanner sc=new Scanner(System.in);
           int a,b,c;
           System.out.println("enter values for a and b");
           a=sc.nextInt();
           b=sc.nextInt();
           c=a+b;
           System.out.println("output="+c);
}
}