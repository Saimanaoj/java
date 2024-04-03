class pal
{
public static void main(String arg[])
{
int n=121,pa1=0,temp,rem;
temp=n;
rem=n%10;
pal=pal*10+rem;
n=n/10; 
if(temp==pal)
{
System.out.print("it is a palindrome");
}
else
{
System.out.print("it is not a palindrome");
}
}
}