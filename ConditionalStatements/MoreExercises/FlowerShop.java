package ConditionalStatements.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");
        int magnolias = Integer.parseInt(sc.nextLine());
        int hyacinths = Integer.parseInt(sc.nextLine());
        int roses = Integer.parseInt(sc.nextLine());
        int cacti = Integer.parseInt(sc.nextLine());
        double giftPrice = Double.parseDouble(sc.nextLine());
        double flowersPrice = (magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cacti * 8) * 0.95;
        if (flowersPrice >= giftPrice) {
            double moneyLeft = Math.floor(flowersPrice - giftPrice);
            System.out.println("She is left with " + df.format(moneyLeft) + " leva.");
        } else {
            double moneyNeeded = Math.ceil(giftPrice - flowersPrice);
            System.out.println("She will have to borrow " + df.format(moneyNeeded) + " leva.");
        }

    }
}
