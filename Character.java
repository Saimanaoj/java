class Character
{
public static void main(String arg[])
{
string statement="harshitha birthday is @21,#$%@";
int count=0;
for(i=0; i<statement.length(); i++)
{
char ch=statement.charAt(i);
if(!Character.isLettersorDigit(ch)&&!Character.isWhiespace(ch))
{
count++;
}
}
System.out.print("special Character"+count);
}
}