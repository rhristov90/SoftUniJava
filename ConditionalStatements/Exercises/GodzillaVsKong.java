package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double priceClothing = Double.parseDouble(sc.nextLine());
        double clothing = statists * priceClothing;
        double decor = 0.1 * budget;
        if (statists > 150) {
            double discount = 0.1 * clothing;
            clothing -= discount;
        }
        double budget1 = clothing + decor;
        if (budget1 > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", budget1 - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - budget1);
        }
    }
}
