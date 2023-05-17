package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int min = Integer.MAX_VALUE;
        while(!input.equals("Stop")){
            int num = Integer.parseInt(input);
            if(num<min){
                min = num;
            }
            input = sc.nextLine();
        } System.out.println(min);
    }
}
