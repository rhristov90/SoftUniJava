package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = Double.parseDouble(sc.nextLine()) * 100;
        double w = Double.parseDouble(sc.nextLine()) * 100;
        int rows = (int) w;
        int columns = (int) h;
        rows -= 100;
        rows = rows / 70;
        columns = columns / 120;
        int result = rows * columns - 3;

        System.out.println(result);
    }
}