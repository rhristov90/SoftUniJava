package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num < smallest) {
                smallest = num;
            }
            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.println("Max number: " + biggest);
        System.out.println("Min number: " + smallest);
    }
}
