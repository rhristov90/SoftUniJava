package ConditionalStatements.Exercises;

import java.util.Scanner;

public class TimePlusFifteenMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());
        min += 15;
        if (min > 59) {
            hours += 1;
            min -= 60;
        } if(hours==24){
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, min);
    }
}
