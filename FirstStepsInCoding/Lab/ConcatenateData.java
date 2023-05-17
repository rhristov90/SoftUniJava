package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        int years = Integer.parseInt(sc.nextLine());
        String town = sc.nextLine();
        System.out.println("You are " + fname + " " + lname + ", a " + years + "-years old person from " + town + ".");

    }
}
