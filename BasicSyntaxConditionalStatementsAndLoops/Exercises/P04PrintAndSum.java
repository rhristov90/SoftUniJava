package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = Integer.parseInt(sc.nextLine());
        int endNum = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for(int i = startNum;i<=endNum;i++){
            System.out.printf("%d ",i);
            sum += i;
        } System.out.printf("\nSum: %d", sum);
    }
}
