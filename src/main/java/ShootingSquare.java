import java.util.Scanner;

public class ShootingSquare {

    public static void main(String[] args) {
        char area[][] = new char[5][5];
        System.out.println("All set. Get ready to rumble!");
        System.out.println("Please enter a line for fire!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int lineFire = sc.nextInt();

                    if (lineFire <= 5 && lineFire >= 1) { break;
                    } else { System.out.println("Enter a number between 1 and 5");
                }

            } catch(Exception e){
                System.out.println("Enter a valid number");
                sc.next();
                continue;

                }
            }
        System.out.println("Please enter a shooting bar");

        while (true) {
            try {
                int shootingBar = sc.nextInt();

                if (shootingBar <= 5 && shootingBar >= 1) { break;
                } else { System.out.println("Enter a number between 1 and 5");
                }

            } catch(Exception e){
                System.out.println("Enter a valid number");
                sc.next();
                continue;

            }

        }


        }
    }

