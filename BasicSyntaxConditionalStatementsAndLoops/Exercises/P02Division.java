package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int a = 0;
        if(num%10==0){
            a=10;
        } else if (num%7==0){
            a=7;
        } else if(num%6==0){
            a=6;
        } else if(num%3==0){
            a=3;
        } else if(num%2==0){
            a=2;
        }
        if(a!=0){
            System.out.println("The number is divisible by "+a);
        } else {
            System.out.println("Not divisible");
        }
    }
}
