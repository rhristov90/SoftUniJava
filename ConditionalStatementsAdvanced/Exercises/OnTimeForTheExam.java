package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hourOfExam = Integer.parseInt(sc.nextLine());
        int minuteOfExam = Integer.parseInt(sc.nextLine());
        int hourOfArrival = Integer.parseInt(sc.nextLine());
        int minuteOfArrival = Integer.parseInt(sc.nextLine());
        int examAllMinutes = hourOfExam * 60 + minuteOfExam;
        int arrivalAllMinutes = hourOfArrival * 60 + minuteOfArrival;
        int difference = examAllMinutes - arrivalAllMinutes;
        if (difference > 30) {
            System.out.printf("Early\n");
        } else if (difference <= 30 && difference >= 0) {
            System.out.printf("On time\n");
        } else if (difference < 0) {
            System.out.printf("Late\n");
        }
        int minutes = difference % 60;
        int hours = difference / 60;
        if (minutes > 0 && hours<=0) {
            System.out.printf("%d minutes before the start", minutes);
        } else if (hours >= 1) {
            if (minutes < 10) {
                System.out.printf("%d:0%d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d:%d hours before the start", hours, minutes);
            }
        } else if (difference >= -59 && difference < 0) {
            System.out.printf("%d minutes after the start", Math.abs(minutes));
        } else if (hours <= -1) {
            if (minutes > -10) {
                System.out.printf("%d:0%d hours after the start", Math.abs(hours), Math.abs(minutes));
            } else {
                System.out.printf("%d:%d hours after the start", Math.abs(hours), Math.abs(minutes));
            }
        }
    }
}