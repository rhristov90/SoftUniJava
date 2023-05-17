package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vacationDays = Integer.parseInt(sc.nextLine());
        int workDays = 365 - vacationDays;
        int playMinutes = workDays * 63 + vacationDays * 127;
        if (playMinutes >= 30000) {
            int difference = playMinutes - 30000;
            System.out.println("Tom will run away");
            System.out.println(difference / 60 + " hours and " + difference % 60 + " minutes more for play");
        } else {
            int difference = 30000 - playMinutes;
            System.out.println("Tom sleeps well");
            System.out.println(difference / 60 + " hours and " + difference % 60 + " minutes less for play");
        }
    }
}
