class five extends Thread
{
	public void run()
	{	for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 9 = "+i*9);
		}
	}
}
class ten extends Thread
{
	public void run()
	{	for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 11= "+i*11);
		}
	}
}
class table
{
	public static void main(String arg[])
	{
		five f=new five();
		ten  t=new ten();
		f.start();	
		t.start();
	}
}
