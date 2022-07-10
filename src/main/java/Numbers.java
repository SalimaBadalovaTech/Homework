import java.util.Random;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner sn = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Hi! Please tell me your name:");
        String name = sn.nextLine();
        int rand_num = rnd.nextInt(101);
        System.out.println(name + ", enter the number you wish!");
        int guess;
        do {
            guess = sn.nextInt();
            if (guess > rand_num) {
                System.out.println("Your number is too big. Please, try again.");
            } else if (guess < rand_num) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
            }
        } while (rand_num != guess);
    }
}
