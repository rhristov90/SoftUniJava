package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        String typeOfGroup = sc.nextLine();
        int studentsCount = Integer.parseInt(sc.nextLine());
        int daysOfCamping = Integer.parseInt(sc.nextLine());
        double price = 0.0;
        String typeOfSport = "";
        if ("Winter".equals(season)) {
            if ("boys".equals(typeOfGroup)) {
                typeOfSport = "Judo";
                price = studentsCount * 9.60 * daysOfCamping;
            } else if ("girls".equals(typeOfGroup)) {
                typeOfSport = "Gymnastics";
                price = studentsCount * 9.60 * daysOfCamping;
            } else if ("mixed".equals(typeOfGroup)) {
                typeOfSport = "Ski";
                price = studentsCount * 10 * daysOfCamping;
            }
        } else if ("Spring".equals(season)) {
            if ("boys".equals(typeOfGroup)) {
                typeOfSport = "Tennis";
                price = studentsCount * 7.20 * daysOfCamping;
            } else if ("girls".equals(typeOfGroup)) {
                typeOfSport = "Athletics";
                price = studentsCount * 7.20 * daysOfCamping;
            } else if ("mixed".equals(typeOfGroup)) {
                typeOfSport = "Cycling";
                price = studentsCount * 9.50 * daysOfCamping;
            }
        } else if ("Summer".equals(season)) {
            if ("boys".equals(typeOfGroup)) {
                typeOfSport = "Football";
                price = studentsCount * 15 * daysOfCamping;
            } else if ("girls".equals(typeOfGroup)) {
                typeOfSport = "Volleyball";
                price = studentsCount * 15 * daysOfCamping;
            } else if ("mixed".equals(typeOfGroup)) {
                typeOfSport = "Swimming";
                price = studentsCount * 20 * daysOfCamping;
            }
        }
        if (studentsCount >= 10 && studentsCount < 20) {
            price *= 0.95;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            price *= 0.85;
        } else if (studentsCount>=50) {
            price *= 0.5;
        }
        System.out.printf("%s %.2f", typeOfSport, price);
    }
}
