import java.util.Scanner;
import  java.util.Random;
public class guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random ran = new Random();
        int cornum = ran.nextInt(100)+1;
        System.out.println("Guessing Game:");
        while(true){
            System.out.println("Enter the number between 1-100:");
            int guess = sc.nextInt();
            if(guess == cornum){
                System.out.println("You have guessed the correct number:");
                break;

            }
            else if (guess<cornum){
                System.out.println("Try higher number");
            }
            else{
                System.out.println("Try lower number");
            }
        }

    }
}
