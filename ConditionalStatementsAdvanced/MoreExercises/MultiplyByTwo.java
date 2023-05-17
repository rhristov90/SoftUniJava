package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());
        double result = 0;
        while (num >= 0) {
            result = 2 * num;
            System.out.printf("Result: %.2f\n", result);
            num = Double.parseDouble(sc.nextLine());
        }
        if (num < 0) {
            System.out.println("Negative number!");
        }
    }
}

