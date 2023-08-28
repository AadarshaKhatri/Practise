import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers:");
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        System.out.println("Choose the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                float add = num1 + num2;
                System.out.println("Your final answer is :" + add);
                break;
             case 2:
                float sub = num1 - num2;
                System.out.println("Your final answer is " + sub);
                break;
             case 3:
                float multi = num1 * num2;
                System.out.println("Your final answer is " + multi);
                break;
            case 4:
                float div = num1 / num2;
                System.out.println("Your final answer is " + div);
                break;

            default:
            System.out.println("ERROR");
            break;
        }
    }
}
