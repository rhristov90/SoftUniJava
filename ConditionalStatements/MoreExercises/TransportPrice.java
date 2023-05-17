package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = Integer.parseInt(sc.nextLine());
        String dayOrNight = sc.nextLine();
        double taxiDayPricePerKm = 0.79;
        double taxiNightPricePerKm = 0.9;
        double busPricePerKm = 0.09;
        double trainPricePerKm = 0.06;
        double price = 0;
        if (distance < 20) {
            if (dayOrNight.equals("day")) {
                price = taxiDayPricePerKm * distance + 0.70;
            } else {
                price = taxiNightPricePerKm * distance + 0.70;
            }
            System.out.printf("%.2f", price);
        }
        if (distance >= 20 && distance < 100) {
            price = busPricePerKm * distance;
            System.out.printf("%.2f", price);
        }
        if (distance >= 100) {
            price = distance * trainPricePerKm;
            System.out.printf("%.2f", price);
        }
    }
}
