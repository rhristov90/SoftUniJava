package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(sc.nextLine());
        double topStudents = 0;
        double failStudents = 0;
        double goodStudents = 0;
        double midStudents = 0;
        double avgGrade = 0;
        double totalGrade = 0;
        for (int i = 1; i <= numberOfStudents; i++) {
            double grade = Double.parseDouble(sc.nextLine());
            totalGrade += grade;
            if (grade >= 2.00 && grade <= 2.99) {
                failStudents += 1;
            } else if (grade >= 3.00 && grade <= 3.99) {
                midStudents += 1;
            } else if (grade >= 4.00 && grade <= 4.99) {
                goodStudents += 1;
            } else {
                topStudents += 1;
            }
        }
        avgGrade = totalGrade / numberOfStudents;
        double p1 = topStudents / numberOfStudents * 100;
        double p2 = goodStudents / numberOfStudents * 100;
        double p3 = midStudents / numberOfStudents * 100;
        double p4 = failStudents / numberOfStudents * 100;
        System.out.printf("Top students: %.2f%%\n", p1);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",p2);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",p3);
        System.out.printf("Fail: %.2f%%\n",p4);
        System.out.printf("Average: %.2f\n", avgGrade);
    }
}
