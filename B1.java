class A
{
   int a,b,c;
   void get()
   {
    a=20;
    b=30;
   }
    void Add()
   {
    c=a+b;
    System.out.println("Addition="+c);
   }
}
  class B1 extends A
   {
    int d,e,f;
    void get()
   {
super.get();
    d=30;
   }
    void Add()
   {
super.Add();
    e=a+d;f=c+d;
    System.out.println("Addition e="+e);
    System.out.println("Addition f="+f);
   }
    public static void main(String args[])
   {
    B1 obj=new B1();
    obj.get();
    obj.Add();
    
   }
   }