package ForLoop.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int numOfGroups = Integer.parseInt(sc.nextLine());
        int musala = 0, montBlanc = 0, kilimanjaro = 0, k2 = 0, everest = 0;
        for (int i = 1; i <= numOfGroups; i++) {
            int pplInGroup = Integer.parseInt(sc.nextLine());
            if (pplInGroup <= 5) {
                musala += pplInGroup;
            } else if (pplInGroup <= 12 && pplInGroup > 5) {
                montBlanc += pplInGroup;
            } else if (pplInGroup <= 25 && pplInGroup > 12) {
                kilimanjaro += pplInGroup;
            } else if (pplInGroup <= 40 && pplInGroup > 25) {
                k2 += pplInGroup;
            } else {
                everest += pplInGroup;
            }
        }
        double allPeople = musala + montBlanc + kilimanjaro + k2 + everest;
        double musalaPercent = musala / allPeople * 100;
        double montBlancPercent = montBlanc / allPeople * 100;
        double kilimanjaroPercent = kilimanjaro / allPeople * 100;
        double k2Percent = k2 / allPeople * 100;
        double everestPercent = everest / allPeople * 100;

        System.out.println(df.format(musalaPercent) + "%");
        System.out.println(df.format(montBlancPercent) + "%");
        System.out.println(df.format(kilimanjaroPercent) + "%");
        System.out.println(df.format(k2Percent) + "%");
        System.out.println(df.format(everestPercent) + "%");
    }
}
