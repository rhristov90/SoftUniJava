package BasicSyntaxConditionalStatementsAndLoops.Exercises;
import java.util.Scanner;
public class P09Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOrders = Integer.parseInt(sc.nextLine());
        double price = 0;
        double totalPrice = 0;
        for(int i = 1; i <=countOrders; i++){
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int daysOfMonth = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());
            price = (daysOfMonth*capsulesCount)*pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n",price);
            totalPrice +=price;
        }
        System.out.printf("Total: $%.2f", totalPrice);


    }
}
