package ForLoop.Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            System.out.println(letter);
        }
    }
}
