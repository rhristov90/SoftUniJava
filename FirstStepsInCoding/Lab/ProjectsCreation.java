package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("The architect " + name + " will need " + num * 3 + " hours to complete " + num + " project/s.");
    }
}
