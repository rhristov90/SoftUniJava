package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        double balance = Double.parseDouble(input);
        double totalMoney = balance;
        double totalSpend = 0;
        double price = 0;

        while (true) {

            if (balance == 0) {

                System.out.println("Out of money!");
                break;
            }

            input = sc.nextLine();

            if ("Game time".equalsIgnoreCase(input)) {
                break;
            }

            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (balance >= price && price > 0) {

                totalSpend += price;
                balance -= price;
                System.out.printf("Bought %s%n", input);

            } else if (balance < price && price > 0) {

                System.out.println("Too Expensive");
            }

            price = 0;

        }

        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, (totalMoney - totalSpend));
        }

    }
}
