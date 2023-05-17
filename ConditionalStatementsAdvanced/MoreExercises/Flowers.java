package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(sc.nextLine());
        int roses = Integer.parseInt(sc.nextLine());
        int tulips = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        String holidayOrNot = sc.nextLine();
        double priceChrysanthemums = 0;
        double priceRoses = 0, priceTulips = 0;
        double priceBouquet = 0;
        double flowers = chrysanthemums + roses + tulips;
        double a = 1.15;
        if ("Y".equals(holidayOrNot)) {
            if ("Spring".equals(season)) {
                priceChrysanthemums = chrysanthemums * 2 * a;
                priceRoses = roses * 4.1 * a;
                priceTulips = tulips * 2.5 * a;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
                if (tulips > 7) {
                    priceBouquet *= 0.95;
                }
            } else if ("Summer".equals(season)) {
                priceChrysanthemums = chrysanthemums * 2 * a;
                priceRoses = roses * 4.1 * a;
                priceTulips = tulips * 2.5 * a;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
            } else if ("Autumn".equals(season)) {
                priceChrysanthemums = chrysanthemums * 3.75 * a;
                priceRoses = roses * 4.5 * a;
                priceTulips = tulips * 4.15 * a;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
            } else if ("Winter".equals(season)) {
                priceChrysanthemums = chrysanthemums * 3.75 * a;
                priceRoses = roses * 4.5 * a;
                priceTulips = tulips * 4.15 * a;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
                if (roses >= 10) {
                    priceBouquet *= 0.9;
                }
            }
            if (flowers > 20) {
                priceBouquet *= 0.8;
            }
        } else if ("N".equals(holidayOrNot)) {
            if ("Spring".equals(season)) {
                priceChrysanthemums = chrysanthemums * 2;
                priceRoses = roses * 4.1;
                priceTulips = tulips * 2.5;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
                if (tulips > 7) {
                    priceBouquet *= 0.95;
                }
            } else if ("Summer".equals(season)) {
                priceChrysanthemums = chrysanthemums * 2;
                priceRoses = roses * 4.1 ;
                priceTulips = tulips * 2.5;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
            } else if ("Autumn".equals(season)) {
                priceChrysanthemums = chrysanthemums * 3.75;
                priceRoses = roses * 4.5;
                priceTulips = tulips * 4.15;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
            } else if ("Winter".equals(season)) {
                priceChrysanthemums = chrysanthemums * 3.75;
                priceRoses = roses * 4.5;
                priceTulips = tulips * 4.15;
                priceBouquet = priceChrysanthemums + priceRoses + priceTulips;
                if (roses >= 10) {
                    priceBouquet *= 0.9;
                }
            } if (flowers > 20) {
                priceBouquet *= 0.8;
            }
        } System.out.printf("%.2f", priceBouquet + 2);
    }
}