package ConditionalStatements.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int areaVine = Integer.parseInt(sc.nextLine());
        double grapeKg = Double.parseDouble(sc.nextLine());
        int vineNeeded = Integer.parseInt(sc.nextLine());
        int numWorkers = Integer.parseInt(sc.nextLine());
        double vineProduced = grapeKg * areaVine * 0.4 / 2.5;
        if (vineProduced < vineNeeded) {
            double difference = vineNeeded - vineProduced;
            System.out.println("It will be a tough winter! More " + df.format(Math.floor(difference)) + " liters wine needed.");
        } else {
            double difference = vineProduced - vineNeeded;
            System.out.println("Good harvest this year! Total wine: " + df.format(Math.floor(vineProduced)) + " liters.");
            System.out.println(df.format(Math.ceil(difference)) + " liters left -> " + df.format(Math.ceil(difference / numWorkers)) + " liters per person.");
        }
    }
}
