import java.util.Scanner;
class rev{
public static void main(String arg[])
{
String original, reverse = "";  
      		original = "heh"; 
      		int length = original.length();   
      		for ( int i = length - 1; i >= 0; i-- )  
         		reverse = reverse + original.charAt(i);  
      		if (original.equals(reverse))  
         		System.out.println(original+" is a palindrome.");  
      		else  
         		System.out.println(original+" isn't a palindrome.");   
   	}  

}

