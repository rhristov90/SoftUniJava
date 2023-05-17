package ForLoop.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOfActor = sc.nextLine();
        double pointsFromAcademy = Double.parseDouble(sc.nextLine());
        int numberOfJudges = Integer.parseInt(sc.nextLine());
        double pointsOfActor = 0;
        for (int i = 1; i <= numberOfJudges; i++) {
            String nameOfJudge = sc.nextLine();
            double pointsFromJudge = Double.parseDouble(sc.nextLine());
            pointsOfActor += (nameOfJudge.length() * pointsFromJudge) / 2;
            if (pointsOfActor + pointsFromAcademy >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, pointsOfActor + pointsFromAcademy);
                break;
            }
        }
        if (pointsOfActor + pointsFromAcademy < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, 1250.5 - (pointsOfActor + pointsFromAcademy));
        }
    }
}

