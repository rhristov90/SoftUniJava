package WhileLoop.Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        int counter = 0;
        boolean isFound = false;
        String currentBook = sc.nextLine();

        while (!"No More Books".equals(currentBook)) {
            if (currentBook.equals(book)) {
                isFound = true;
                break;
            }
            counter++;
            currentBook = sc.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.printf("The book you search is not here!\n You checked %d books.", counter);
        }
    }
}
