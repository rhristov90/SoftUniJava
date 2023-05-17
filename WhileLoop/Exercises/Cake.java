package WhileLoop.Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(sc.nextLine());
        int cakeLength = Integer.parseInt(sc.nextLine());
        int cakePieces = cakeLength * cakeWidth;
        String str = "";
        while (cakePieces >= 0) {
            str = sc.nextLine();
            if ("STOP".equals(str)) {
                System.out.printf("%d pieces are left.", cakePieces);
                break;
            } else {
                int a = Integer.parseInt(str);
                cakePieces -= a;
            }
        }
        if (!str.equals("STOP")) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        }
    }
}
