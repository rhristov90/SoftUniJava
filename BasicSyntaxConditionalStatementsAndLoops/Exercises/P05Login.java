package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String password = new StringBuffer(user).reverse().toString();
        int counter = 1;
        String pass = sc.nextLine();
        while (!pass.equals(password) && counter < 4) {
            System.out.print("Incorrect password. Try again.\n");
            pass = sc.nextLine();
            counter++;
        }
        if (pass.equals(password)) {
            System.out.printf("User %s logged in.", user);
        } else {
            System.out.printf("User %s blocked!", user);
        }
    }

}

