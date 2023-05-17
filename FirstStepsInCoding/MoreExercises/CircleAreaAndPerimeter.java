package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());
        double area = Math.PI*r*r;
        double perimeter = 2*r*Math.PI;
        System.out.printf("%.2f\n%.2f\n", area, perimeter);

    }
}
