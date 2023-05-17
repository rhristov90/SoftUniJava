package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankPartTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fuel = sc.nextLine();
        double litersFuel = Double.parseDouble(sc.nextLine());
        String clubCard = sc.nextLine();
        if (fuel.equals("Gas")) {
            double price = 0.93 * litersFuel;
            double discount = 0;
            if (clubCard.equals("Yes")) {
                price = 0.85 * litersFuel;
            }
            if (litersFuel >= 20 && litersFuel <= 25) {
                discount = 0.08 * price;
            } else if (litersFuel > 25) {
                discount = 0.1 * price;
            }
            System.out.printf("%.2f lv.", price - discount);
        }
        if (fuel.equals("Gasoline")) {
            double price = 2.22 * litersFuel;
            double discount = 0;
            if (clubCard.equals("Yes")) {
                price = 2.04 * litersFuel;
            }
            if (litersFuel >= 20 && litersFuel <= 25) {
                discount = 0.08 * price;
            } else if (litersFuel > 25) {
                discount = 0.1 * price;
            }
            System.out.printf("%.2f lv.", price - discount);
        }
        if (fuel.equals("Diesel")) {
            double price = 2.33 * litersFuel;
            double discount = 0;
            if (clubCard.equals("Yes")) {
                price = 2.21 * litersFuel;
            }
            if (litersFuel >= 20 && litersFuel <= 25) {
                discount = 0.08 * price;
            } else if (litersFuel > 25) {
                discount = 0.1 * price;
            }
            System.out.printf("%.2f lv.", price - discount);
        }
    }
}
