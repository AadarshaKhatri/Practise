import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1-7: ");
        days = sc.nextInt();
        if (days>=1 & days<=7){
            if (days == 1){
                System.out.println("SUNDAY");
            }
            else if (days ==2 ) {
                System.out.println("MONDAY");
            }
            else if (days==3) {
                System.out.println("TUESDAY");
            }
            else if (days==4) {
                System.out.println("Wednesday");
            }
            else if (days==5) {
                System.out.println("THURSDAY");
            }
            else if (days==6) {
                System.out.println("FRIDAY");
            }
            else if (days==7){
                System.out.println("SATURDAY");

            }
        }else {
            System.out.println("Error");
        }

    }
}
