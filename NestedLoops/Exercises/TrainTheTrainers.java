package NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numJury = Integer.parseInt(sc.nextLine());
        int countAllGrades = 0;
        double allGrades = 0;
        String command = sc.nextLine();
        while (!command.equals("Finish")) {
            String presentation = command;
            double sumCurrentGrades = 0;
            for (int i = 1; i <= numJury; i++) {
                double currentGrade = Double.parseDouble(sc.nextLine());
                countAllGrades++;
                sumCurrentGrades += currentGrade;
            }
            allGrades += sumCurrentGrades;
            double avgCurrentGrade = sumCurrentGrades / numJury;
            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGrade);
            command = sc.nextLine();
        }
        double finalGrade = allGrades / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}
