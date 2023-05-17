package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while (sum < num) {
            int currentNum = Integer.parseInt(sc.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
