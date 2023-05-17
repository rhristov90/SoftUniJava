package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int position = text.length() - 1; position>=0; position --){
            System.out.print(text.charAt(position));
        }
    }
}
