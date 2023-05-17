package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penpkg = Integer.parseInt(sc.nextLine());
        int markerkpkg = Integer.parseInt(sc.nextLine());
        int litres = Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());
        double penprice = penpkg * 5.80;
        double markerprice = markerkpkg * 7.20;
        double prepprice = litres * 1.2;
        double result = penprice + markerprice + prepprice;
        double result1 = result * discount/100;
        System.out.println(result-result1);
    }
}
