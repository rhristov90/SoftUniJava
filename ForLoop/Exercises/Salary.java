package ForLoop.Exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabsOpen = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= tabsOpen; i++) {
            String website = sc.nextLine();
            if ("Facebook".equals(website)) {
                salary -= 150;
            } else if ("Instagram".equals(website)) {
                salary -= 100;
            } else if ("Reddit".equals(website)) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
