package ForLoop.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int cargoNumber = Integer.parseInt(sc.nextLine());
        double sumBusCargoTonnage = 0;
        double sumTruckCargoTonnage = 0;
        double sumTrainCargoTonnage = 0;
        double busPrice = 0;
        double truckPrice = 0;
        double trainPrice = 0;
        double totalCargo = 0;
        for (int i = 1; i <= cargoNumber; i++) {
            int cargoTonnage = Integer.parseInt(sc.nextLine());
            if (cargoTonnage <= 3) {
                sumBusCargoTonnage += cargoTonnage;
                busPrice += cargoTonnage * 200;
            } else if (cargoTonnage >= 4 && cargoTonnage <= 11) {
                sumTruckCargoTonnage += cargoTonnage;
                truckPrice += cargoTonnage * 175;
            } else if (cargoTonnage >= 12) {
                sumTrainCargoTonnage += cargoTonnage;
                trainPrice += cargoTonnage * 120;
            }
            totalCargo += cargoTonnage;
        }
        double avgPrice = (busPrice + trainPrice + truckPrice) / totalCargo;
        double percentBusCargo = sumBusCargoTonnage / totalCargo * 100;
        double percentTruckCargo = sumTruckCargoTonnage / totalCargo * 100;
        double percentTrainCargo = sumTrainCargoTonnage / totalCargo * 100;
        System.out.println(df.format(avgPrice));
        System.out.println(df.format(percentBusCargo) + "%");
        System.out.println(df.format(percentTruckCargo) + "%");
        System.out.println(df.format(percentTrainCargo) + "%");
    }
}
