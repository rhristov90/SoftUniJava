package ConditionalStatements.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int volumePool = Integer.parseInt(sc.nextLine());
        int debitPipe1 = Integer.parseInt(sc.nextLine());
        int debitPipe2 = Integer.parseInt(sc.nextLine());
        double hours = Double.parseDouble(sc.nextLine());
        int sumDebit = debitPipe1 + debitPipe2;
        double presentVolume = sumDebit * hours;
        if (presentVolume <= volumePool) {
            double percent = presentVolume / volumePool * 100;
            double volumePipe1 = debitPipe1 * hours;
            double percentPipe1 = volumePipe1 / presentVolume * 100;
            double volumePipe2 = debitPipe2 * hours;
            double percentPipe2 = volumePipe2 / presentVolume * 100;
            System.out.println("The pool is " + df.format(percent) + "% full. Pipe 1: " + df.format(percentPipe1) + "%. Pipe 2: " + df.format(percentPipe2) + "%.");
        } else {
            double overflow = presentVolume - volumePool;
            System.out.println("For " + df.format(hours) + " hours the pool overflows with " + df.format(overflow) + " liters.");
        }
    }
}
