class five extends Thread
{
	public void run()
	{	for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 5 = "+i*5);
		}
	}
}
class ten extends Thread
{
	public void run()
	{	for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 10= "+i*10);
		}
	}
}
class R176
{
	public static void main(String arg[])
	{
		five f=new five();
		ten  t=new ten();
		f.start();	
		t.start();
	}
}
