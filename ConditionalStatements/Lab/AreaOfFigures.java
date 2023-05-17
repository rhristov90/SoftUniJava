package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fig = sc.nextLine();
        if (fig.equals("square")) {
            double a = Double.parseDouble(sc.nextLine());
            double A = a * a;
            System.out.printf("%.3f", A);
        } else if (fig.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double A = a * b;
            System.out.printf("%.3f", A);
        } else if (fig.equals("circle")) {
            double r = Double.parseDouble(sc.nextLine());
            double A = Math.PI * r * r;
            System.out.printf("%.3f", A);
        } else if (fig.equals("triangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            double A = a * h / 2;
            System.out.printf("%.3f", A);
        }
    }
}
