package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int multiplier = Integer.parseInt(sc.nextLine());
        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", num, i, num * i);
            }
        } else {
            System.out.printf("%d X %d = %d\n", num, multiplier, num * multiplier);
        }
    }
}