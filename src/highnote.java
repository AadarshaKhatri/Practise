import java.util.Scanner;
public class highnote {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Emter any number:");
        int a = sc.nextInt();
        int b = a/1000;
        System.out.println("Your have" + b +"notes of 1000");
        int c = b/500;
        int d = c/100;
        int e = d/50;
        int f = e/20;
        int g = f/10;
        int h = g/5;
        System.out.println("Your have" + c +"notes of 1000");
        System.out.println("Your have" + d +"notes of 1000");
        System.out.println("Your have" + e +"notes of 1000");
        System.out.println("Your have" + f +"notes of 1000");
        System.out.println("Your have" + g +"notes of 1000");
        System.out.println("Your have" + h +"notes of 1000");

    }


}
