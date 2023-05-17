package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine()) / 100;
        double volume = length * width * height * 0.001;
        double water = volume * (1 - percent);
        System.out.println(water);
    }
}
