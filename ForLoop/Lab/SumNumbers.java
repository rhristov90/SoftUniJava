package ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= numbers; i++) {
            int num = Integer.parseInt(sc.nextLine());
            sum += num;
        } System.out.println(sum);
    }
}
