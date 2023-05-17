package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String category = sc.nextLine();
        int pplCount = Integer.parseInt(sc.nextLine());
        double transportPrice = 0;
        double ticketsPrice = 0;
        if ("VIP".equals(category)) {
            ticketsPrice = pplCount * 499.99;
        } else if ("Normal".equals(category)) {
            ticketsPrice = pplCount * 249.99;
        }
        if (pplCount >= 1 && pplCount <= 4) {
            transportPrice = 0.75 * budget;
        } else if (pplCount >= 5 && pplCount <= 9) {
            transportPrice = 0.6 * budget;
        } else if (pplCount >= 10 && pplCount <= 24) {
            transportPrice = 0.5 * budget;
        } else if (pplCount >= 25 && pplCount <= 49) {
            transportPrice = 0.4 * budget;
        } else if (pplCount >= 50) {
            transportPrice = 0.25 * budget;
        }
        double totalPrice = ticketsPrice + transportPrice;
        if (budget>totalPrice){
            double moneyLeft = budget - totalPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double moneyNeed = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
        }
    }
}
