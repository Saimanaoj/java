import java.util.Scanner;
class pyramid
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j;
for(i=n;i>=1;i--)
{
for(j=n;j>=i;j--)
{
System.out.print(" ");
}
for(j=i;j>=1;j--)
{
System.out.println( " * ");
}
System.out.println();
}
}
}