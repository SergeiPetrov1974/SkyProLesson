package sky.pro_lesson_10_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    List<Author> authors = new ArrayList<>();
    private String nameBook;
    private int year;

    public Book(String nameBook, Author author, int year) {
        this.nameBook = nameBook;
        this.year = year;
        authors.add(new Author(author.getSurname(), author.getFirstName()));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(nameBook, book.nameBook) &&
                Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, year, authors);
    }

    @Override
    public String toString() {
        for (Author author : authors) {
            return "Book: " + nameBook + " by " + author;

        }
        return null;
    }
}
