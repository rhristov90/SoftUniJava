package ForLoop.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0;i<=n;i+=2){
            System.out.println(df.format(Math.pow(2, i)));
        }
    }
}
