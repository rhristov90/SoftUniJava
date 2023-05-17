package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double recordTime = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double secPerMeter = Double.parseDouble(sc.nextLine());
        double IvanTime = secPerMeter * distance;
        double resistance = Math.floor(distance / 15) * 12.5;
        IvanTime += resistance;
        if (IvanTime < recordTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", IvanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", IvanTime - recordTime);
        }
    }
}
