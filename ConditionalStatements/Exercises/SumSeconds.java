package ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int sec = 0, min = 0;
        int sum = first + second + third;
        sec = sum % 60;
        min = sum / 60;
        if (sec >= 10) {
            System.out.printf("%d:%d", min, sec);
        } else {
            System.out.printf("%d:02%d", min, sec);
        }

    }
}
