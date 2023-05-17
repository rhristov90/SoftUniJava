package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capacityOfStadium = Integer.parseInt(sc.nextLine());
        double numFans = Integer.parseInt(sc.nextLine());
        double percentSectorA = 0, percentSectorB = 0, percentSectorV = 0, percentSectorG = 0, percentStadium = 0;
        double fansInSectorA = 0, fansInSectorB = 0, fansInSectorV = 0, fansInSectorG = 0;
        for (int i = 1; i <= numFans; i++) {
            String sector = (sc.nextLine());
            if ("A".equals(sector)) {
                fansInSectorA += 1;
            } else if ("B".equals(sector)) {
                fansInSectorB += 1;
            } else if ("V".equals(sector)) {
                fansInSectorV += 1;
            } else if ("G".equals(sector)) {
                fansInSectorG += 1;
            }
        }
        percentStadium = numFans/capacityOfStadium * 100;
        percentSectorA = fansInSectorA / numFans * 100;
        percentSectorB = fansInSectorB / numFans * 100;
        percentSectorV = fansInSectorV / numFans * 100;
        percentSectorG = fansInSectorG / numFans * 100;
        System.out.printf("%.2f%%\n",percentSectorA);
        System.out.printf("%.2f%%\n",percentSectorB);
        System.out.printf("%.2f%%\n",percentSectorV);
        System.out.printf("%.2f%%\n",percentSectorG);
        System.out.printf("%.2f%%\n",percentStadium);
    }
}
