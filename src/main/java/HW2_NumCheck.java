import java.util.Scanner;

public class HW2_NumCheck {
    public static int CheckNumber (int num) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                 num = sc.nextInt();

                if (num <= 5 && num >= 1) { break;
                } else { System.out.println("Enter a number between 1 and 5");
                }

            } catch(Exception e){
                System.out.println("Enter a valid number");
                sc.next();
                continue;

            }
        }
        return num;
    }
}



