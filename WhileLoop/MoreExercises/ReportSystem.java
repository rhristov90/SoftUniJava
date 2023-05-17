package WhileLoop.MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSum = Double.parseDouble(sc.nextLine());
        double collectedSum = 0;
        double cash = 0;
        double card = 0;
        int counter = 0;
        int cashCount = 0;
        int cardCount = 0;
        String input = "";
        while (collectedSum < totalSum) {
            input = sc.nextLine();
            if ("End".equals(input)) {
                break;
            }
            int money = Integer.parseInt(input);
            counter++;

            if (counter % 2 == 0 && money >= 10) {
                cardCount++;
                card += money;
                collectedSum += money;
                System.out.println("Product sold!");
            } else if (counter % 2 != 0 && money <= 100) {
                cashCount++;
                cash += money;
                collectedSum += money;
                System.out.println("Product sold!");
            } else {
                System.out.println("Error in transaction!");
            }
        }

        if (collectedSum >= totalSum) {
            double averageCash = cash / cashCount;
            double averageCard = card / cardCount;
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}

