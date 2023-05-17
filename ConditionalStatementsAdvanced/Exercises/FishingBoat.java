package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fisherMan = Integer.parseInt(sc.nextLine());
        double totalPrice = 0;
        int shipRentSpring = 3000;
        int shipRentSummer = 4200;
        int shipRentAutumn = 4200;
        int shipRentWinter = 2600;
        if ("Spring".equals(season)) {
            if (fisherMan <= 6) {
                totalPrice = shipRentSpring * 0.90;
            } else if (fisherMan > 6 && fisherMan <= 11) {
                totalPrice = shipRentSpring * 0.85;
            } else if (fisherMan >= 12) {
                totalPrice = shipRentSpring * 0.75;
            }
        } else if ("Summer".equals(season)) {
            if (fisherMan <= 6) {
                totalPrice = shipRentSummer * 0.90;
            } else if (fisherMan > 6 && fisherMan <= 11) {
                totalPrice = shipRentSummer * 0.85;
            } else if (fisherMan >= 12) {
                totalPrice = shipRentSummer * 0.75;
            }
        } else if ("Winter".equals(season)) {
            if (fisherMan <= 6) {
                totalPrice = shipRentWinter * 0.90;
            } else if (fisherMan > 6 && fisherMan <= 11) {
                totalPrice = shipRentWinter * 0.85;
            } else if (fisherMan >= 12) {
                totalPrice = shipRentWinter * 0.75;
            }
        } else if ("Autumn".equals(season)) {
            if (fisherMan <= 6) {
                totalPrice = shipRentAutumn * 0.90;
            } else if (fisherMan > 6 && fisherMan <= 11) {
                totalPrice = shipRentAutumn * 0.85;
            } else if (fisherMan >= 12) {
                totalPrice = shipRentAutumn * 0.75;
            }
        }
        if (fisherMan % 2 == 0 && !"Autumn".equals(season)) {
            totalPrice *= 0.95;
        }
            if (budget >= totalPrice) {
                double moneyLeft = budget - totalPrice;
                System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
            } else {
                double moneyNeed = totalPrice - budget;
                System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
            }
        }
    }
