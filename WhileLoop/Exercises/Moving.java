package WhileLoop.Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        int volume = width*length*height;
        String input = "";
        while(volume>=0){
            input = sc.nextLine();

            if("Done".equals(input)){
                System.out.printf ("%d Cubic meters left.", volume);
                break;
            } else {
                int numBoxes = Integer.parseInt(input);
                volume -= numBoxes;
            }
        }
        if (!"Done".equals(input)){
            System.out.printf ("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }
    }
}
