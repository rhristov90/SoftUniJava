package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickenmenu = Integer.parseInt(sc.nextLine());
        int fishmenu = Integer.parseInt(sc.nextLine());
        int vegimenu = Integer.parseInt(sc.nextLine());

        double menuprice = chickenmenu * 10.35 + fishmenu * 12.40 + vegimenu * 8.15;
        double desert = 0.2 * menuprice;
        System.out.println(menuprice + desert + 2.5);
    }
}
