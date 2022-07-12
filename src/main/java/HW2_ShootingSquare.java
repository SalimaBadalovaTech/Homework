import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW2_ShootingSquare {

    public static void main(String[] args) {
        char area[][] = new char[5][5];
        for (char[] row : area)
            Arrays.fill(row, '-');
        System.out.println("All set. Get ready to rumble!");

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int targetLine = rnd.nextInt(1, 5);
        int targetBar = rnd.nextInt(1, 5);
//        System.out.println(targetLine + " " + targetBar);

        for (int i = 0; i < area.length; i++) {
                System.out.println("Please enter a line for fire!");
                int lineFire = HW2_NumCheck.CheckNumber(i); // it worked but I didn't get how:) Need an explanation
                System.out.println("Please enter a line for shooting bar!");
                int shootingBar = HW2_NumCheck.CheckNumber(i);
                area[lineFire-1][shootingBar-1] = '*';
                if (lineFire == targetLine && shootingBar == targetBar) {
                    System.out.println("Congrats! You won!");
                    area[targetLine-1][targetBar-1] = 'x';
                    System.out.println(Arrays.deepToString(area).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                    break;

                } else {
                    System.out.println("You missed the target!");
                    System.out.println(Arrays.deepToString(area).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
                }


            }

        }

    }





