package WhileLoop.MoreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            double a = Double.parseDouble(sc.nextLine());
            sum += a;
        } System.out.printf("%.2f", sum/num);
    }
}
