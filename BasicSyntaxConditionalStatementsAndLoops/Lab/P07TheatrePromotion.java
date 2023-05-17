package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String typeOfDay = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        if("Weekday".equals(typeOfDay)){
            if(age>=0&&age<=18){
                System.out.println("12$");
            } else if(age>18&&age<=64){
                System.out.println("18$");
            } else if(age>64&&age<=122){
                System.out.println("12$");
            } else {
                System.out.println("Error!");
            }
        } else if("Weekend".equals(typeOfDay)){
            if(age>=0&&age<=18){
                System.out.println("15$");
            } else if(age>18&&age<=64){
                System.out.println("20$");
            } else if(age>64&&age<=122){
                System.out.println("15$");
            } else {
                System.out.println("Error!");
            }
        } else if("Holiday".equals(typeOfDay)){
            if(age>=0&&age<=18){
                System.out.println("5$");
            } else if(age>18&&age<=64){
                System.out.println("12$");
            } else if(age>64&&age<=122){
                System.out.println("10$");
            } else {
                System.out.println("Error!");
            }
        }
    }
}
