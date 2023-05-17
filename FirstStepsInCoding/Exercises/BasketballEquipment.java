package FirstStepsInCoding.Exercises;

import java.util.Scanner;

//•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = Integer.parseInt(sc.nextLine());
        double snk = tax - 0.4 * tax;
        double outfit = snk - 0.2 * snk;
        double ball = 0.25 * outfit;
        double acc = 0.2 * ball;
        System.out.println(tax + snk + outfit + ball + acc);

    }
}
