package ConditionalStatementsAdvanced.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String projection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());
        int seats = rows * columns;
        switch (projection) {
            case "Premiere":
                System.out.println(df.format(seats * 12) + " leva");
                break;
            case "Normal":
                System.out.println(df.format(seats * 7.5) + " leva");
                break;
            case "Discount":
                System.out.println(df.format(seats * 5) + " leva");
        }
    }
}
