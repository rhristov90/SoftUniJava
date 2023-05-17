package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double qty = Double.parseDouble(sc.nextLine());
        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(qty * 0.50);
            } else if (product.equals("water")) {
                System.out.println(qty * 0.80);
            } else if (product.equals("beer")) {
                System.out.println(qty * 1.20);
            } else if (product.equals("sweets")) {
                System.out.println(qty * 1.45);
            } else if (product.equals("peanuts")) {
                System.out.println(qty * 1.60);
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(qty * 0.45);
            } else if (product.equals("water")) {
                System.out.println(qty * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(qty * 1.10);
            } else if (product.equals("sweets")) {
                System.out.println(qty * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.println(qty * 1.55);
            }
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(qty * 0.40);
            } else if (product.equals("water")) {
                System.out.println(qty * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(qty * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(qty * 1.30);
            } else if (product.equals("peanuts")) {
                System.out.println(qty * 1.50);
            }
        }
    }
}
