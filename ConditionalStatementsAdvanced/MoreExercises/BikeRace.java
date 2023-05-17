package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juniors = Integer.parseInt(sc.nextLine());
        int seniors = Integer.parseInt(sc.nextLine());
        String trace = sc.nextLine();
        double taxSeniors = 0;
        double taxJuniors = 0;
        double taxTotal = 0;
        if ("trail".equals(trace)) {
            taxJuniors = juniors * 5.5;
            taxSeniors = seniors * 7;
            taxTotal = taxJuniors + taxSeniors;
        } else if ("cross-country".equals(trace)) {
            taxJuniors = juniors * 8;
            taxSeniors = seniors * 9.5;
            taxTotal = taxJuniors + taxSeniors;
            if (juniors + seniors >= 50) {
                taxTotal *= 0.75;
            }
        } else if ("downhill".equals(trace)) {
            taxJuniors = juniors * 12.25;
            taxSeniors = seniors * 13.75;
            taxTotal = taxJuniors + taxSeniors;
        } else if ("road".equals(trace)) {
            taxJuniors = juniors * 20;
            taxSeniors = seniors * 21.5;
            taxTotal = taxJuniors + taxSeniors;
        } taxTotal *= 0.95;
        System.out.printf("%.2f",taxTotal);
    }
}
