package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            leftSum += Integer.parseInt(sc.nextLine());
        }
        for (int i = 1; i <= n; i++) {
            rightSum += Integer.parseInt(sc.nextLine());
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else if (leftSum!=rightSum){
            System.out.println("No, diff = " + Math.abs(leftSum-rightSum));
        }
    }
}
