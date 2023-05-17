package ConditionalStatementsAdvanced.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();
        double result = 0;
        if ("+".equals(operator)) {
            result = num1 + num2;
            if (result % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", num1, operator, num2, result);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", num1, operator, num2, result);
            }
        } else if ("-".equals(operator)) {
            result = num1 - num2;
            if (result % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", num1, operator, num2, result);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", num1, operator, num2, result);
            }
        } else if ("*".equals(operator)) {
            result = num1 * num2;
            if (result % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", num1, operator, num2, result);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", num1, operator, num2, result);
            }
        } else if ("/".equals(operator) && num2 != 0) {
            result = num1 / num2;
            System.out.printf("%.0f %s %.0f = %.2f", num1, operator, num2, result);
        } else if ("%".equals(operator) && num2 != 0) {
            result = num1 % num2;
            System.out.printf("%.0f %s %.0f = %.0f", num1, operator, num2, result);
        } else {
            System.out.printf("Cannot divide %.0f by zero", num1);
        }
    }
}


