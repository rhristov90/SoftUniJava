package FirstStepsInCoding.Exercises;
import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit = Double.parseDouble(sc.nextLine());
        int term = Integer.parseInt(sc.nextLine());
        double air = Double.parseDouble(sc.nextLine())/100;
        double sum = deposit + term*((deposit*air)/12);
        System.out.println(sum);
    }
}
