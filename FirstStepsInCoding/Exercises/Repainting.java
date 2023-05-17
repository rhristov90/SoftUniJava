package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int thinner = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        double nylonprice = (nylon + 2) * 1.50;
        double paintprice = (paint + 0.1 * paint) * 14.50;
        double thinnerprice = thinner * 5.0;
        double matsprice = nylonprice + paintprice + thinnerprice + 0.4;
        double masterprice = 0.3 * matsprice * hours;
        System.out.println(matsprice + masterprice);
    }
}
