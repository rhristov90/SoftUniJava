package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degrees = Integer.parseInt(sc.nextLine());
        String partOfDay = sc.nextLine();
        String outfit = "";
        String shoes = "";
        if ("Morning".equals(partOfDay)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        } else if ("Afternoon".equals(partOfDay)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (degrees >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        } else if ("Evening".equals(partOfDay)) {
            if (degrees >= 10) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

        }
    }
}

     /*   switch (partOfDay) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
                } else if (degrees > 18 && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees > 18 && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degrees);
                }
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees > 18 && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                }
                break;
        }
    }
} */
