package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beginNum = Integer.parseInt(sc.nextLine());
        int endNum = Integer.parseInt(sc.nextLine());
        int magicNum = Integer.parseInt(sc.nextLine());
        int counter = 0;
        boolean a = true;
        for (int i = beginNum; i <= endNum; i++) {
            for (int j = beginNum; j <= endNum; j++) {
                counter++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", counter, i, j, magicNum);
                    a = false;
                    break;
                }
            }
            if (!a) {
                break;
            }
        }
        if (a) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
