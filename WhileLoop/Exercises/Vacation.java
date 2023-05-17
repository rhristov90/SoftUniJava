package WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyTrip = Double.parseDouble(sc.nextLine());
        double availableMoney = Double.parseDouble(sc.nextLine());
        int days = 0;
        int daysSpending = 0;
        boolean sheSpentTooMuch = false;
        while (availableMoney < moneyTrip) {
            String spendOrSaved = sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());
            days++;
            if ("save".equals(spendOrSaved)) {
                availableMoney += amount;
                daysSpending = 0;
            } else {
                daysSpending++;
                availableMoney -= amount;
                if(availableMoney<=0){
                    availableMoney = 0;
                }
                if(daysSpending == 5){
                    System.out.printf("You can't save the money.\n%d",days);
                    sheSpentTooMuch = true;
                    break;
                }
            }
        }
        if(!sheSpentTooMuch){
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
