package WhileLoop.MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottlesDetergent = Integer.parseInt(sc.nextLine());
        int detergent = bottlesDetergent * 750;
        int count = 1;
        int pots = 0;
        int dishes = 0;
        String str = "";
        while (detergent >= 0) {
            str = sc.nextLine();
            if ("End".equals(str)) {
                System.out.printf("Detergent was enough!\n%d dishes and %d pots were washed.\nLeftover detergent %d ml.", dishes, pots, detergent);
                break;
            } else {
                int plate = Integer.parseInt(str);
                if (count % 3 == 0) {
                    detergent -= 15 * plate;
                    pots += plate;
                } else {
                    dishes += plate;
                    detergent -= 5 * plate;
                }
                count++;
            }
        }
        if (!"End".equals(str) || detergent < 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}
