package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        double carRent = 0;
        if (budget <= 100) {
            if ("Summer".equals(season)) {
                carRent = 0.35 * budget;
                System.out.printf("Economy class\nCabrio - %.2f", carRent);
            } else if ("Winter".equals(season)) {
                carRent = 0.65 * budget;
                System.out.printf("Economy class\nJeep - %.2f", carRent);
            }
        } else if (budget > 100 && budget <= 500) {
            if ("Summer".equals(season)) {
                carRent = 0.45 * budget;
                System.out.printf("Compact class\nCabrio - %.2f", carRent);
            } else if ("Winter".equals(season)) {
                carRent = 0.80 * budget;
                System.out.printf("Compact class\nJeep - %.2f", carRent);
            }
        } else if (budget > 500) {
            if ("Winter".equals(season)||"Summer".equals(season)) {
                carRent = 0.9 * budget;
                System.out.printf("Luxury class\nJeep - %.2f", carRent);
            }
        }
    }
}
