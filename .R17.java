class fibo extends Thread
{
    public void run()
 {
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=10;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
 class Rev extends thread
 {

    public void run() 
{
        System.out.println("Reverse Count:");
        for (int i = 10; i >= 1; i--)
 {
            System.out.print(i + " ");
        }
}
        System.out.println();
class R17
{
	public static void main(String arg[])
	{
		fibo f=new fibo();
		rev  t=new rev();
		f.start();	
		t.start();
	}
}

    }
}

}