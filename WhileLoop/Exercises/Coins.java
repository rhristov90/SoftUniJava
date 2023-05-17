package WhileLoop.Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double instead = Double.parseDouble(sc.nextLine());
        instead = Math.floor(instead * 100);
        int coins = 0;

        while (instead > 0) {
            if (instead >= 200) {
                coins++;
                instead -= 200;
            } else if (instead >= 100) {
                coins++;
                instead -= 100;
            } else if (instead >= 50) {
                coins++;
                instead -= 50;
            } else if (instead >= 20) {
                coins++;
                instead -= 20;
            } else if (instead >= 10) {
                coins++;
                instead -= 10;
            } else if (instead >= 5) {
                coins++;
                instead -= 5;
            } else if (instead >= 2) {
                coins++;
                instead -= 2;
            } else if (instead >= 1) {
                coins++;
                instead -= 1;
            }

        }
        System.out.println(coins);
    }
}
