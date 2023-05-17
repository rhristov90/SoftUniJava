package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vpricekg = Double.parseDouble(sc.nextLine());
        double fpricekg = Double.parseDouble(sc.nextLine());
        int vkg = Integer.parseInt(sc.nextLine());
        int fkg = Integer.parseInt(sc.nextLine());
        double price = (vpricekg*vkg + fpricekg*fkg) / 1.94;
        System.out.printf("%.2f\n",price);
    }
}
