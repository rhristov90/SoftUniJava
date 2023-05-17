package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fuel = sc.nextLine();
        int liters = Integer.parseInt(sc.nextLine());
        if (fuel.equals("Diesel")) {
            if (liters >= 25) {
                System.out.println("You have enough diesel.");
            } else {
                System.out.println("Fill your tank with diesel!");
            }
        } else if (fuel.equals("Gasoline")) {
            if (liters >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else if (fuel.equals("Gas")) {
            if (liters >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
