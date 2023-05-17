package ForLoop.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int numTournaments = Integer.parseInt(sc.nextLine());
        int startingPoints = Integer.parseInt(sc.nextLine());
        double tournamentPoints = 0;
        double w = 0;
        for (int i = 1; i <= numTournaments; i++) {
            String type = sc.nextLine();
            if ("W".equals(type)) {
                tournamentPoints += 2000;
                w += 1;
            } else if ("F".equals(type)) {
                tournamentPoints += 1200;
            } else if ("SF".equals(type)) {
                tournamentPoints += 720;
            }
        }
        double percentSuccess = w / numTournaments * 100;
        double finalPoints = startingPoints + tournamentPoints;
        double avgPoints = tournamentPoints/numTournaments;
        System.out.printf("Final points: %.0f", finalPoints);
        System.out.printf("\nAverage points: %.0f\n", Math.floor(avgPoints));
        System.out.println(df.format(percentSuccess) + "%");
    }
}
