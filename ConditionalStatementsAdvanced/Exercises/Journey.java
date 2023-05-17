package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String place = "";
        String country = "";
        double totalPrice = 0;
        if (budget <= 100) {
            country = "Bulgaria";
            if ("summer".equals(season)) {
                totalPrice = 0.3 * budget;
                place = "Camp";
            } else if ("winter".equals(season)) {
                totalPrice = 0.7 * budget;
                place = "Hotel";
            }
        } else if (budget > 100 && budget <= 1000) {
            country = "Balkans";
            if ("summer".equals(season)) {
                totalPrice = 0.4 * budget;
                place = "Camp";
            } else if ("winter".equals(season)) {
                totalPrice = 0.8 * budget;
                place = "Hotel";
            }
        } else if (budget > 1000) {
            country = "Europe";
            place = "Hotel";
            totalPrice = 0.9 * budget;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", country, place, totalPrice);
    }
}
