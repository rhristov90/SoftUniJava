package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        double walls = 2 * x * x + 2 * x * y - 1.2 * 2 - 2 * 1.5 * 1.5;
        double roof = 2 * x * y + 2 * (x * h / 2);
        double green = walls / 3.4;
        double red = roof / 4.3;
        System.out.printf("%.2f\n%.2f\n", green, red);

    }
}
