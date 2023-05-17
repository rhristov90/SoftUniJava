package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
            } else if (i % 2 != 0) {
                oddSum += num;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else if (evenSum != oddSum) {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenSum - oddSum));
        }
    }
}