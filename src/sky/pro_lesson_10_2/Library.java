package sky.pro_lesson_10_2;
/*
Library library = new Library(2);
library.addBook(theStand);
library.addBook(warAndPeace);
System.out.println(library);
 */

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private int number;


    public Library(int number) {
        this.number = number;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
        return " ";
    }
}
