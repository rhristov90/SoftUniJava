package BasicSyntaxConditionalStatementsAndLoops.Exercises;


import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = Double.parseDouble(sc.nextLine());
        int countStudents = Integer.parseInt(sc.nextLine());
        double priceOfLightsaber = Double.parseDouble(sc.nextLine());
        double priceOfRobe = Double.parseDouble(sc.nextLine());
        double priceOfBelt = Double.parseDouble(sc.nextLine());
        double totalPrice = 0;
        double sumSabers = Math.ceil(countStudents*1.1)*priceOfLightsaber;
        double sumRobes = countStudents*priceOfRobe;
        double sumBelts = (countStudents-countStudents/6)*priceOfBelt;
        totalPrice = sumBelts + sumRobes + sumSabers;
        if(totalPrice<=money){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - money);
        }
    }
}
