package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysOfStay = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String grade = sc.nextLine();
        if ("room for one person".equals(room)) {
            double priceRoom = (daysOfStay - 1) * 18;
            if ("positive".equals(grade)) {
                priceRoom *= 1.25;
            } else if ("negative".equals(grade)) {
                priceRoom *= 0.9;
            }
            System.out.printf("%.2f",priceRoom);
        } else if ("apartment".equals(room)) {
            double priceApartment = (daysOfStay - 1) * 25;
            if (daysOfStay < 10) {
                priceApartment *= 0.7;
            } else if (daysOfStay > 10 && daysOfStay < 15) {
                priceApartment *= 0.65;
            } else if (daysOfStay >= 15) {
                priceApartment *= 0.5;
            } if ("positive".equals(grade)) {
                priceApartment *= 1.25;
            } else if ("negative".equals(grade)) {
                priceApartment *= 0.9;
            }
            System.out.printf("%.2f",priceApartment);
        } else if ("president apartment".equals(room)) {
            double pricePresidentApartment = (daysOfStay - 1) * 35;
            if (daysOfStay < 10) {
                pricePresidentApartment *= 0.9;
            } else if (daysOfStay > 10 && daysOfStay < 15) {
                pricePresidentApartment *= 0.85;
            } else if (daysOfStay >= 15) {
                pricePresidentApartment *= 0.8;
            } if ("positive".equals(grade)) {
                pricePresidentApartment *= 1.25;
            } else if ("negative".equals(grade)) {
                pricePresidentApartment *= 0.9;
            }
            System.out.printf("%.2f",pricePresidentApartment);
        }
    }
}
