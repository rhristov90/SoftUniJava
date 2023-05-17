package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countLostGames = Integer.parseInt(sc.nextLine());
        double priceHeadset = Double.parseDouble(sc.nextLine());
        double priceMouse = Double.parseDouble(sc.nextLine());
        double priceKeyboard = Double.parseDouble(sc.nextLine());
        double priceDisplay = Double.parseDouble(sc.nextLine());
        double totalPrice = 0;

        int countHeadset = countLostGames/2;
        int countMouse = countLostGames/3;
        int countKeyboard = countLostGames/6;
        int countDisplay = countLostGames/12;

        totalPrice = countHeadset*priceHeadset + countMouse*priceMouse + countKeyboard*priceKeyboard + countDisplay*priceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
