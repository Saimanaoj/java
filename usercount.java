import java.util.Scanner;
class usercount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();
        
        
        int studentUsers = totalUsers - staffUsers;
        
        
        int nonTeachingStaff = staffUsers / 3;
        
        
        System.out.println("Student Users: " + studentUsers);
        
        
    }
}
```
