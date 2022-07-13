import java.util.Objects;
import java.util.Scanner;


public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Monday";
        schedule[1][0] = "Tuesday";
        schedule[2][0] = "Wednesday";
        schedule[3][0] = "Thursday";
        schedule[4][0] = "Friday";
        schedule[5][0] = "Saturday";
        schedule[6][0] = "Sunday";
        schedule[0][1] = "Java";
        schedule[1][1] = "Pilates";
        schedule[2][1] = "Fun with friends";
        schedule[3][1] = "Painting";
        schedule[4][1] = "Reading";
        schedule[5][1] = "Watching";
        schedule[6][1] = "Sleeping";


        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the day of the week:");
        while (true) {
            String weekday = sc.nextLine().replace(" ", "");
            if (weekday.equals("exit")) {break;};
            String correctWeekday = weekday;
            if (weekday.length() > 0) {
                correctWeekday = weekday.substring(0, 1).toUpperCase() + weekday.substring(1, weekday.length()).toLowerCase();
            }

//            System.out.println(correctWeekday);
            int index = -1;
            for (int i = 0; i < schedule.length; i++) {
                int j = 0;
                if (Objects.equals(schedule[i][j], correctWeekday)) {
                    index = i;
//                    System.out.println(index);
                    break;
                }

            }
            if (index == -1) {
                System.out.println("Sorry, I don't understand you, please try again.");
            } else {
                System.out.println("Your tasks for "+ schedule[index][0] + ": " + schedule[index][1]);
                System.out.println("Please, input the day of the week:");
            }
        }
    }
}

