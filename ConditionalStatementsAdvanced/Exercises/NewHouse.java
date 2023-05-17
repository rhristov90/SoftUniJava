package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flowers = sc.nextLine();
        int flowersCount = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double rosesPrice = flowersCount * 5;
        double dahliasPrice = flowersCount * 3.8;
        double tulipsPrice = flowersCount * 2.8;
        double narcissusPrice = flowersCount * 3;
        double gladiolusPrice = flowersCount * 2.5;
        double totalPrice = 0.0;
        if ("Roses".equals(flowers)) {
            totalPrice = rosesPrice;
            if (flowersCount > 80) {
                totalPrice *= 0.9;
            }
        } else if ("Dahlias".equals(flowers)) {
            totalPrice = dahliasPrice;
            if (flowersCount > 90) {
                totalPrice *= 0.85;
            }
        } else if ("Tulips".equals(flowers)) {
            totalPrice = tulipsPrice;
            if (flowersCount > 80) {
                totalPrice *= 0.85;
            }
        } else if ("Narcissus".equals(flowers)) {
            totalPrice = narcissusPrice;
            if (flowersCount < 120) {
                totalPrice = narcissusPrice * 1.15;
            }
        } else if ("Gladiolus".equals(flowers)) {
            totalPrice = gladiolusPrice;
            if (flowersCount < 80) {
                totalPrice = gladiolusPrice * 1.2;
            }
        }
        if (budget >= totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, moneyLeft);
        } else {
            double moneyNeeded = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
        }
    }
}
