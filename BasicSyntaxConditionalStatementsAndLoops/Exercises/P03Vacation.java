package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        String typeOfGroup = sc.nextLine();
        String day = sc.nextLine();
        double totalPrice = 0;
        double price = 0;
        if (typeOfGroup.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }
        if (people >= 30 && typeOfGroup.equals("Students")) {
            totalPrice = price * people * 0.85;
        } else if (people >= 100 && typeOfGroup.equals("Business")) {
            totalPrice = price * (people - 10);
        } else if (people >= 10 && people <= 20 && typeOfGroup.equals("Regular")) {
            totalPrice = price * people * 0.95;
        } else {
            totalPrice = price * people;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}



