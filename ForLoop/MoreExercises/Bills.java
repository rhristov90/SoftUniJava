package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = Integer.parseInt(sc.nextLine());
        double electricityForAllMonths = 0;
        double otherExpensesForOneMonth = 0;
        double otherExpensesForAllMonths = 0;
        for (int i = 1; i <= months; i++) {
            double electricityForOneMonth = Double.parseDouble(sc.nextLine());
            electricityForAllMonths += electricityForOneMonth;
            otherExpensesForOneMonth = (electricityForOneMonth + 20 + 15) * 1.2;
            otherExpensesForAllMonths += otherExpensesForOneMonth;
        }
        double waterForAllMonths = 20 * months;
        double internetForAllMonths = 15 * months;
        double avgExpensesPerMonth = (electricityForAllMonths + otherExpensesForAllMonths + waterForAllMonths + internetForAllMonths)/months;
        System.out.printf("Electricity: %.2f lv\n", electricityForAllMonths);
        System.out.printf("Water: %.2f lv\n",waterForAllMonths);
        System.out.printf("Internet: %.2f lv\n", internetForAllMonths);
        System.out.printf("Other: %.2f lv\n", otherExpensesForAllMonths);
        System.out.printf("Average: %.2f lv\n", avgExpensesPerMonth);

    }
}
