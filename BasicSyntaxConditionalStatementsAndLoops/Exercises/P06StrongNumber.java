package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int input = num;
        int factorialSum = 0;
        while (num > 0) {
            int number = num % 10;
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            factorialSum += factorial;
            num /= 10;
        }

        if (factorialSum == input) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}



