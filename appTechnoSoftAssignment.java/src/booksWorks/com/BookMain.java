package booksWorks.com;

import java.util.Arrays;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book();
        BooksMethods booksMethods = new BooksMethods();
        Scanner scanner = new Scanner(System.in);
        String[][] booksArray=new String[2][5];

       for (int i=1;i<=2;i++){
           System.out.println("Enter the title of the book");
           book.setTitle(scanner.nextLine());

           System.out.println("Enter the author of the book");
           book.setAuthor(scanner.nextLine());

           System.out.println("Enter the price of the book");
           book.setPrice(scanner.nextFloat());
           scanner.nextLine();

           System.out.println("Enter the publisher of the book");
           book.setPublisher(scanner.nextLine());

           System.out.println("Enter the ISBN of the book");
           book.setISBN(scanner.nextLine());
            booksArray= booksMethods.storeBooks(book);
       }
        System.out.println("Title             Author             Price            Publisher              ISBN");
        System.out.println("====             ========            =====             ========               =====");
        for (String[] book1 : booksArray) {
            System.out.printf("%-10s %-12s %-10s %-15s %s%n", book1[0], book1[1], book1[2], book1[3], book1[4]);
        }


        System.out.println("total cost of the books is:"+booksMethods.totalCost());
        System.out.println("total number of books is:"+ booksMethods.totalNumberOfBooks());
        System.out.println("The max price of the book is:"+booksMethods.maxCost());
        System.out.println("The min price of the book is:"+booksMethods.minCost());
        System.out.println("The average cost of the book is :"+booksMethods.averageCost());









    }
}
