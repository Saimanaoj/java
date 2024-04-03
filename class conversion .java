public class conversion 
{
public static void main(String args[])
{
String s = new String("i am meghana");
String str1 = "hello";
String str2 = "hi";
System.out.println("String length is: " + s.length());
System.out.println("Index of 'm' is: " + s.indexOf('m'));
System.out.println("Substring from index 2 is: " + s.substring(2));
System.out.println("Character at index 2 is: " + s.charAt(2));
System.out.println("String after replace 'm' with 'g': " + s.replace('m', 'g'));
System.out.println("String in uppercase is: " + s.toUpperCase());
System.out.println("String in lowercase is: " + s.toLowerCase());
System.out.println("str1.equals(str2) is " + str1.equals(str2));
System.out.println("Comparison of str2 and str1 is " + str2.compareTo(str1));
}
}