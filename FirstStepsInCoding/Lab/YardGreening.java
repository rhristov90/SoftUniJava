package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double squares = Double.parseDouble(sc.nextLine());
        double price = squares * 7.61;
        double discount = 0.18*price;
        double endprice = price - discount;

        System.out.println("The final price is: " + endprice  + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
