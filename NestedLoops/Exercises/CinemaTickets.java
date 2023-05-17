package NestedLoops.Exercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countStandard = 0;
        int countStudent = 0;
        int countKid = 0;
        int countTotalTickets = 0;
        String command = sc.nextLine();

        while (!command.equals("Finish")) {
            String movie = command;
            int seats = Integer.parseInt(sc.nextLine());
            int countCurrentTickets = 0;
            String ticketType = sc.nextLine();

            while (!ticketType.equals("End")) {
                countCurrentTickets++;
                countTotalTickets++;
                if (ticketType.equals("student")) {
                    countStudent++;
                } else if (ticketType.equals("standard")) {
                    countStandard++;
                } else if (ticketType.equals("kid")) {
                    countKid++;
                }

                if (countCurrentTickets >= seats) {
                    break;
                }
                ticketType = sc.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, countCurrentTickets * 1.0 / seats * 100);
            command = sc.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudent * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandard * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", countKid * 1.0 / countTotalTickets * 100);


    }
}
