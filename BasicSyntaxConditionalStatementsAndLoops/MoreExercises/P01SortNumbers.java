package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int min = 0, max = 0, mid = 0;
        if (a > b && a > c) {
            max = a;
            mid = Math.max(b, c);
            min = Math.min(b, c);
        } else if (b > a && b > c) {
            max = b;
            mid = Math.max(a, c);
            min = Math.min(a, c);
        } else if (c > a && c > b) {
            max = c;
            mid = Math.max(a, b);
            min = Math.min(a, b);
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
