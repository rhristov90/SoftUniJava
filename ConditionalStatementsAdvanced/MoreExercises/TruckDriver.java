package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        double kmPerMonth = Double.parseDouble(sc.nextLine());
        double salary = 0;
        if (kmPerMonth <= 5000) {
            if ("Spring".equals(season) || "Autumn".equals(season)) {
                salary = kmPerMonth * 0.75;
            } else if ("Summer".equals(season)) {
                salary = kmPerMonth * 0.9;
            } else if ("Winter".equals(season)) {
                salary = kmPerMonth * 1.05;
            }
        } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
            if ("Spring".equals(season) || "Autumn".equals(season)) {
                salary = kmPerMonth * 0.95;
            } else if ("Summer".equals(season)) {
                salary = kmPerMonth * 1.1;
            } else if ("Winter".equals(season)) {
                salary = kmPerMonth * 1.25;
            }
        } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
            salary = kmPerMonth * 1.45;
        }
        salary *= 0.9;
        System.out.printf("%.2f", salary*4);
    }
}
