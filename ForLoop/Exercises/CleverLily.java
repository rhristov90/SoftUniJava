package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageOfLilly = Integer.parseInt(sc.nextLine());
        double washMachinePrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());
        int toys = 0;
        int moneyFromBDays = 0;
        int brotherMoney = 0;
        for (int i = 1; i <= ageOfLilly; i++) {
            if (i % 2 != 0) {
                toys += 1;
            } else if(i%2==0) {
                brotherMoney += 1;
                moneyFromBDays = moneyFromBDays + i * 10/2;
            }
        }
        int moneyFromToys = toys * toyPrice;
        int moneySaved = moneyFromToys + moneyFromBDays - brotherMoney;
        if (moneySaved >= washMachinePrice) {
            double moneyLeft = moneySaved - washMachinePrice;
            System.out.printf("Yes! %.2f", moneyLeft);
        } else {
            double moneyNeed = washMachinePrice - moneySaved;
            System.out.printf("No! %.2f", moneyNeed);
        }
    }
}
