package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int seriesTime = Integer.parseInt(sc.nextLine());
        int breakTime = Integer.parseInt(sc.nextLine());
        double lunchTime = 0.125*breakTime;             // 1/8
        double relaxTime = 0.25*breakTime;              // 1/4
        double freeTime = breakTime - lunchTime - relaxTime;
        if (freeTime>=seriesTime) {
            double timeEnough = Math.ceil(freeTime - seriesTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, timeEnough);
        } else {
            double timeNeeded = Math.ceil(seriesTime - freeTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, timeNeeded);
        }
    }
}
