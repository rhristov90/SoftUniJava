package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String accommodation = "";
        String location = "";
        double price = 0;
        if (budget <= 1000) {
            accommodation = "Camp";
            if ("Summer".equals(season)) {
                location = "Alaska";
                price = 0.65 * budget;
            } else if ("Winter".equals(season)) {
                location = "Morocco";
                price = 0.45 * budget;
            }
        } else if (budget > 1000 && budget <= 3000) {
            accommodation = "Hut";
            if ("Summer".equals(season)) {
                location = "Alaska";
                price = 0.8 * budget;
            } else if ("Winter".equals(season)) {
                location = "Morocco";
                price = 0.60 * budget;
            }
        } else if (budget>3000) {
            accommodation = "Hotel";
            price = 0.9 * budget;
            if ("Summer".equals(season)) {
                location = "Alaska";
            } else if ("Winter".equals(season)) {
                location = "Morocco";
            }
        } System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
