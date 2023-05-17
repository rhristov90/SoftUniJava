package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyGet = Double.parseDouble(sc.nextLine());
        int yearToLive = Integer.parseInt(sc.nextLine());
        int ageOfIvan = 17;
        for (int i = 1800; i <= yearToLive; i++) {
            ageOfIvan += 1;
            if (i % 2 == 0) {
                moneyGet -= 12000;
            } else {
                moneyGet -= 12000 + (50 * ageOfIvan);
            }
        }
        if (moneyGet >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyGet);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyGet));
        }
    }
}
