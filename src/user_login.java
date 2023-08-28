import java.util.Scanner;
public class user_login {
    public static void main(String[] args) {
        String Username = "adarsha01";
        String Password = "12345678";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username:");
        String user = sc.nextLine();
        System.out.println("Enter your password:");
        String pass = sc.nextLine();
        if (Username.equals(user) && Password.equals(pass)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
