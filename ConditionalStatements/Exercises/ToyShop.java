package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceTrip = Double.parseDouble(sc.nextLine());
        int puzzleCount = Integer.parseInt(sc.nextLine());
        int dollCount = Integer.parseInt(sc.nextLine());
        int teddyCount = Integer.parseInt(sc.nextLine());
        int minionCount = Integer.parseInt(sc.nextLine());
        int truckCount = Integer.parseInt(sc.nextLine());
        int totalCount = puzzleCount + dollCount + teddyCount + minionCount + teddyCount + truckCount;
        double totalPrice = puzzleCount * 2.60 + dollCount * 3 + teddyCount * 4.10 + minionCount * 8.20 + truckCount * 2;
        if (totalCount >= 50) {
            totalPrice = totalPrice - totalPrice*0.25;
        }
        totalPrice = 0.9 * totalPrice;
        if (totalPrice>=priceTrip){
            double moneyLeft = totalPrice - priceTrip;
            System.out.printf("Yes! %.2f lv left.",moneyLeft);
        } else {
            double moneyNeeded = priceTrip-totalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }
    }
}
