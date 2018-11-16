package prw2.exercises.ex1;

import java.util.Scanner;

public class PrintApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey what's the title of your book?");
        String bookTitle = scanner.nextLine();
        System.out.println("Hey what's your book about?");
        String bookContent = scanner.nextLine();
        Article article = new Article(bookTitle, bookContent);
        Printer printer = new Printer();
        printer.print(article);
    }

}
