package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOfStudent = sc.nextLine();
        int counter = 1;
        double sum = 0;
        int excluded = 0;
        while (counter <= 12) {
            double grade = Double.parseDouble(sc.nextLine());
            if (grade < 4.00) {
                excluded += 1;
                if (excluded == 2) {
                    System.out.printf("%s has been excluded at %d grade\n", nameOfStudent, counter);
                    break;
                } else continue;
            }
            sum += grade;
            counter++;
        }
        double average = sum / 12;
        if(counter >= 12)
            System.out.printf("%s graduated. Average grade: %.2f", nameOfStudent, average);

    }
}

