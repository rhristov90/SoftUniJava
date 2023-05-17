package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogfoodnum = Integer.parseInt(sc.nextLine());
        int catfoodnum = Integer.parseInt(sc.nextLine());
        double dogfoodprice = 2.5*dogfoodnum;
        int catfoodprice = 4*catfoodnum;
        double price = dogfoodprice+catfoodprice;
        System.out.println(price + " lv.");

    }
}
