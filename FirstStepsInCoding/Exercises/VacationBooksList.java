package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pages = Integer.parseInt(sc.nextLine());
        int pagesforhour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        int hours = pages / pagesforhour;
        System.out.println(hours / days);
    }
}
