package NestedLoops.Lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int validCombinationsCounter = 0;
        // x1 + x2 + x3
        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++){
                    if(x1+x2+x3 == n){
                        validCombinationsCounter ++;
                    }
                }
            }
        } System.out.println(validCombinationsCounter);
    }
}
