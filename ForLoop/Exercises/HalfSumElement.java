package ForLoop.Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 1; i<=n;i++){
            int number = Integer.parseInt(sc.nextLine());
            sum += number;
            if(number>max){
                max = number;
            }
        }
        int sumWithoutMaxNumber = sum - max;
        if(max==sumWithoutMaxNumber){
            System.out.printf("Yes\nSum = %d", max);
        } else {
            System.out.printf("No\nDiff = %d",Math.abs(max - sumWithoutMaxNumber));
        }
    }
}
