package ConditionalStatementsAdvanced.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double qty = Double.parseDouble(sc.nextLine());
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    System.out.println(df.format(qty * 2.50));
                    break;
                case "apple":
                    System.out.println(df.format(qty * 1.20));
                    break;
                case "orange":
                    System.out.println(df.format(qty * 0.85));
                    break;
                case "grapefruit":
                    System.out.println(df.format(qty * 1.45));
                    break;
                case "kiwi":
                    System.out.println(df.format(qty * 2.70));
                    break;
                case "pineapple":
                    System.out.println(df.format(qty * 5.50));
                    break;
                case "grapes":
                    System.out.println(df.format(qty * 3.85));
                    break;
                default:
                    System.out.println("error");
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    System.out.println(df.format(qty * 2.70));
                    break;
                case "apple":
                    System.out.println(df.format(qty * 1.25));
                    break;
                case "orange":
                    System.out.println(df.format(qty * 0.90));
                    break;
                case "grapefruit":
                    System.out.println(df.format(qty * 1.60));
                    break;
                case "kiwi":
                    System.out.println(df.format(qty * 3.00));
                    break;
                case "pineapple":
                    System.out.println(df.format(qty * 5.60));
                    break;
                case "grapes":
                    System.out.println(df.format(qty * 4.20));
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
