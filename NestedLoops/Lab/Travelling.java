package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 0;
        double savedMoney = 0;
        for (int i = 0; i >= 0; i++) {
            String destination = sc.nextLine();
            if("End".equals(destination)){
                break;
            }
            double budget = Double.parseDouble(sc.nextLine());
            for (int j = 0; j >= 0; j++) {
                money = Double.parseDouble(sc.nextLine());
                savedMoney += money;
                if (savedMoney >= budget) {
                    System.out.printf("Going to %s!\n", destination);
                    savedMoney = 0;
                    break;
                }
            }
        }
    }
}
