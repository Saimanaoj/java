mport java.util.*;
import java.io.*;
class pattern
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int i,j;
int a=1;
System.out.println("enter the number of rows");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(a*a+" ");
a++;
 }
System.out.print("\n");
}
}
}
