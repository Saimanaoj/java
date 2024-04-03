 public String
{
public static void main(String args[])
{
String s = new String("saveetha");
String str1 = "hello";
String str2 = "world";
System.out.println("String length is: " + s.length());
System.out.println("Index of 's' is: " + s.indexOf('s'));
System.out.println("Substring from index 2 is: " + s.substring(2));
System.out.println("Character at index 2 is: " + s.charAt(2));
System.out.println("String after replace 's' with 't': " + s.replace('s', 't'));
System.out.println("String in uppercase is: " + s.toUpperCase());
System.out.println("String in lowercase is: " + s.toLowerCase());
System.out.println("str1.equals(str2) is " + str1.equals(str2));
System.out.println("Comparison of str2 and str1 is " + str2.compareTo(str1));
}
}      
