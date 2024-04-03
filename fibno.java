class nine implements Runnable
{
public void run()
{
int a=0,b=1,c;
System.out.println(a);
System.out.println(b);
for(int i=1;i<=3;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
class fibno
{
public static void main(String[] args) {
Thread t1 = new Thread(new nine());
t1.start();
}
}