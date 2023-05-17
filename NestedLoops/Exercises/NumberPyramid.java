package NestedLoops.Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int counter = 1;
        boolean isBigger = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                if(counter>n){
                    isBigger = true;
                    break;
                } System.out.print(counter + " ");
                counter ++;
            } if(isBigger){
                break;
            } System.out.println();
        }
    }
}
