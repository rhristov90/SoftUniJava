package WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int max = Integer.MIN_VALUE;
        while(!input.equals("Stop")){
            int num = Integer.parseInt(input);
            if(num>max){
                max = num;
            }
            input = sc.nextLine();
        } System.out.println(max);
    }
}
