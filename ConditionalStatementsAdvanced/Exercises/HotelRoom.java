package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        if ("May".equals(month) || "October".equals(month)) {
            studioPrice = 50 * days;
            apartmentPrice = 65 * days;
            if (days > 7 && days < 14) {
                studioPrice *= 0.95;
            } else if (days > 14) {
                studioPrice *= 0.7;
                apartmentPrice *= 0.9;
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            studioPrice = 75.20 * days;
            apartmentPrice = 68.70 * days;
            if (days > 14) {
                studioPrice *= 0.8;
                apartmentPrice *= 0.9;
            }
        } else if ("July".equals(month) || "August".equals(month)) {
            studioPrice = 76 * days;
            apartmentPrice = 77 * days;
            if (days > 14) {
                apartmentPrice *= 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
