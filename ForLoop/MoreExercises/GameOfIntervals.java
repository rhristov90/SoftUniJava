package ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moves = Integer.parseInt(sc.nextLine());
        double numFromZeroToNine = 0;
        double numFromTenToNineteen = 0;
        double numFromTwentyToTwentyNine = 0;
        double numFromThirtyToThirtyNine = 0;
        double numFromFortyToFifty = 0;
        double numInvalid = 0;
        double points = 0;
        double sumNumbers = 0;
        for (int i = 1; i <= moves; i++) {
            double number = Double.parseDouble(sc.nextLine());
            sumNumbers += 1;
            if (number >= 0 && number <= 9) {
                numFromZeroToNine += 1;
                points += 0.2 * number;
            } else if (number >= 10 && number <= 19) {
                numFromTenToNineteen += 1;
                points += 0.3 * number;
            } else if (number >= 20 && number <= 29) {
                numFromTwentyToTwentyNine += 1;
                points += 0.40 * number;
            } else if (number >= 30 && number <= 39) {
                numFromThirtyToThirtyNine += 1;
                points += 50;
            } else if (number >= 40 && number <= 50) {
                numFromFortyToFifty += 1;
                points += 100;
            } else {
                numInvalid += 1;
                points = points / 2;
            }
        }
        System.out.printf("%.2f\n", points);
        System.out.printf("From 0 to 9: %.2f%%\n", numFromZeroToNine/sumNumbers * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", numFromTenToNineteen/sumNumbers * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", numFromTwentyToTwentyNine/sumNumbers * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", numFromThirtyToThirtyNine/sumNumbers * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", numFromFortyToFifty/sumNumbers * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", numInvalid/sumNumbers * 100);
    }
}
