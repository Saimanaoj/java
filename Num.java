import java.util.Scanner;
class Num
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j;
for(i=1;i<n;i++)
{
for(j=n-1;j>=0;j--)
{
System.out.print(" ");
}
int c=i;
for(j=0;j<=i;j++)
{
System.out.print(" "+c+" ");
c=c*(i-j)/(j+1);
}
System.out.println();
}
}
}