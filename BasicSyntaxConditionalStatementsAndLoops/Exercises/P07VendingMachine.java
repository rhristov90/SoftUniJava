package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double money = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                money += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n", Double.parseDouble(input));
            }
            input = sc.nextLine();
        }
        String product = sc.nextLine();
         while (!product.equals("End")){

            switch (product) {
                case "Nuts":
                    if (money >= 2) {
                        money = money - 2;
                        System.out.print("Purchased Nuts\n");
                    } else {
                        System.out.print("Sorry, not enough money\n");
                    }
                    break;
                case "Water":
                    if (money >= 0.7) {
                        money = money - 0.7;
                        System.out.print("Purchased Water\n");
                    } else {
                        System.out.print("Sorry, not enough money\n");
                    }
                    break;
                case "Crisps":
                    if (money >= 1.5) {
                        money = money - 1.5;
                        System.out.print("Purchased Crisps\n");
                    } else {
                        System.out.print("Sorry, not enough money\n");
                    }
                    break;
                case "Soda":
                    if (money >= 0.8) {
                        money = money - 0.8;
                        System.out.print("Purchased Soda\n");
                    } else {
                        System.out.print("Sorry, not enough money\n");
                    }
                    break;
                case "Coke":
                    if (money >= 1) {
                        money = money - 1;
                        System.out.print("Purchased Coke\n");
                    } else {
                        System.out.print("Sorry, not enough money\n");
                    }
                    break;
                default:
                    System.out.print("Invalid product\n");
            }
            product = sc.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}