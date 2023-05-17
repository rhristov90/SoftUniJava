package NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        for (int i = firstNum; i <= secondNum; i++) {
            int currentNumber = i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 6; j >= 1; j--) {
                int digit = currentNumber % 10;
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                currentNumber = currentNumber / 10;
            } if(evenSum==oddSum){
                System.out.printf("%d ", i);
            }
        }
    }
}

