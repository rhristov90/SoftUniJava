package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());
        if (num >= 100 && num <= 200 || num == 0) {

        } else {
            System.out.println("invalid");
        }
    }
}
