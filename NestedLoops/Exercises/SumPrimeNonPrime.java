package NestedLoops.Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sumPrime = 0;
        int sumNotPrime = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                input = sc.nextLine();
                continue;
            }
            int counter = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter==2){
                sumPrime += number;
            } else {
                sumNotPrime += number;
            }

            input = sc.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNotPrime);
    }
}
