import java.sql.SQLOutput;
import java.util.Scanner;
public class greaterbt3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Here,");
        System.out.println("A= "+ a);
        System.out.println("B= "+b);
        System.out.println("C = "+c);
        if (a>b & a>c){
            System.out.println("A is the greatest");
        } else if (b>a &b>c) {
            System.out.println("B is the greatest ");
        }
        else{
            System.out.println("C is greatest");
        }


    }
}
