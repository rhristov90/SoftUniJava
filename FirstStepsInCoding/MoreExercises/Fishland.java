package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cenaskumria = Double.parseDouble(sc.nextLine());
        double cenacaca = Double.parseDouble(sc.nextLine());
        double kgpalamud = Double.parseDouble(sc.nextLine());
        double kgsafrid = Double.parseDouble(sc.nextLine());
        int kgmidi = Integer.parseInt(sc.nextLine());

        double cenapalamud = cenaskumria*1.6;
        double cenasafrid = cenacaca*1.8;
        double obshto = cenapalamud*kgpalamud + cenasafrid*kgsafrid + 7.5*kgmidi;
        System.out.printf("%.2f",obshto);

    }
}
