package ConditionalStatements.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");
        int days = Integer.parseInt(sc.nextLine());
        int kgFood = Integer.parseInt(sc.nextLine());
        double dayFoodDogKg = Double.parseDouble(sc.nextLine());
        double dayFoodCatKg = Double.parseDouble(sc.nextLine());
        double dayFoodTurtleKg = Double.parseDouble(sc.nextLine())/1000;
        double foodNeeded = (dayFoodDogKg + dayFoodCatKg + dayFoodTurtleKg) * days;
        if (kgFood >= foodNeeded) {
            double foodLeft = kgFood - foodNeeded;
            System.out.println(df.format(Math.floor(foodLeft)) + " kilos of food left.");
        } else {
            foodNeeded -= kgFood;
            System.out.println(df.format(Math.ceil(foodNeeded)) + " more kilos of food are needed.");
        }
    }
}
