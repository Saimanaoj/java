import java.util.Scanner;
class common
{
public static void main(String arg[])
{
int[]array1={1,2,5,8,3,7,9};
int[]array2={6,7,9,3,1};
list<intger>commonelement=new arraylist<>();
for(int i=0;i<array1.length;i++)
{
for(int j=0;j<array2.length;j++)
{
if(array[i]==array2[j])
{
commonelement.add(array1[i]);
break;
}
}
}
System.out.println("commonelement"+commonelement);
}
}

