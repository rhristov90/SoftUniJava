package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();
        if (hour >= 10 && hour <= 18) {
            if (!day.equals("Sunday")) {
                System.out.println("open");
            } else{
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}


