package ForLoop.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = Integer.parseInt(sc.nextLine());
        double count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (number < 200) {
                count1 += 1;
            } else if (number >= 200 && number <= 399) {
                count2 += 1;
            } else if (number >= 400 && number <= 599) {
                count3 += 1;
            } else if (number >= 600 && number <= 799) {
                count4 += 1;
            } else {
                count5 += 1;
            }
        }
        double p1 = count1 / n * 100;
        double p2 = count2 / n * 100;
        double p3 = count3 / n * 100;
        double p4 = count4 / n * 100;
        double p5 = count5 / n * 100;
        System.out.println(df.format(p1) + "%");
        System.out.println(df.format(p2) + "%");
        System.out.println(df.format(p3) + "%");
        System.out.println(df.format(p4) + "%");
        System.out.println(df.format(p5) + "%");
    }
}
