package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sumOdd = 0;
        int oddNumbers = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(oddNumbers);
            sumOdd += oddNumbers;
            oddNumbers += 2;

        }
        System.out.println("Sum: " + sumOdd);
    }
}

