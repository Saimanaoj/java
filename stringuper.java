import java.util.Scanner;

public class stringuper
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        
        String replacedString = inputString.replace("Saveetha", "Manipal");
        System.out.println("Replaced String: " + replacedString);
        
        
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        
        
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);
        
        
    }
}
