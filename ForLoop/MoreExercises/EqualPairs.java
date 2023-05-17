package ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int lastSum = 0;
        int diff = 0;
        for (int i = 0; i < num; i++) {
            int numOne = Integer.parseInt(sc.nextLine());
            int numSnd = Integer.parseInt(sc.nextLine());
            int sum = numOne + numSnd;
            if (i > 0) {
                diff = Math.abs(lastSum - sum);
            }
            lastSum = sum;
        }

        if (diff == 0) {
            System.out.printf("Yes, value=%d", lastSum);
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}