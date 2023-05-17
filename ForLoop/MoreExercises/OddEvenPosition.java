//https://pastebin.com/kbQz0HrP
package ForLoop.MoreExercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double evenSum = 0;
        double oddSum = 0;
        double evenMax = Double.NEGATIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double oddMin = Double.POSITIVE_INFINITY;
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(sc.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n", oddSum);

        if (oddMin != Double.POSITIVE_INFINITY) {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        } else {
            System.out.printf("OddMin=No,\n");}
        if (oddMax != Double.NEGATIVE_INFINITY) {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        } else {
            System.out.printf("OddMax=No,\n");
        }
        System.out.printf("EvenSum=%.2f,\n", evenSum);
        if (evenMin != Double.POSITIVE_INFINITY) {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
        } else {
            System.out.printf("EvenMin=No,\n");
        }
        if (evenMax != Double.NEGATIVE_INFINITY) {
            System.out.printf("EvenMax=%.2f\n", evenMax);
        } else {
            System.out.printf("EvenMax=No\n");
        }
    }
}
