import java.util.*;

public class Homework1_numbers {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sn = new Scanner(System.in);
        System.out.println("Oyun bashlasinn!");
        System.out.println("Mene adinizi deyin:");
        String name = sn.nextLine();
        int rand_num = rnd.nextInt(101);
        System.out.println(name + ", texmin etdiyiniz reqemi daxil edin!");
        int guess;
        do {
            guess = sn.nextInt();
//            int[] yourNumbers = new int [100];
//            for (int i = 0; i < yourNumbers.length; i++) {
//                yourNumbers[i] = guess;
//                Arrays.sort(yourNumbers, Collections.reverseOrder());
            if (guess > rand_num) {
                System.out.println("Reqem boyukdur, tekrar yoxlayin.");
            } else if (guess < rand_num) {
                System.out.println("Reqem kicikdir, tekrar yoxlayin.");
            } else {
                System.out.println("Tebrikler, " + name + "!");

            }

        } while (rand_num != guess);
    }
}

