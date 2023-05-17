package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int countVC = Integer.parseInt(sc.nextLine());
        int countCPU = Integer.parseInt(sc.nextLine());
        int countRAM = Integer.parseInt(sc.nextLine());
        double priceVC = countVC * 250;
        double priceCPU = 0.35 * priceVC * countCPU;
        double priceRAM = 0.1 * priceVC * countRAM;
        double bill = priceVC + priceCPU + priceRAM;
        if (countVC > countCPU) {
            bill = 0.85 * bill;
        }
        if (bill <= budget) {
            double moneyLeft = budget - bill;
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            double moneyNeed = bill - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeed);
        }
    }
}
