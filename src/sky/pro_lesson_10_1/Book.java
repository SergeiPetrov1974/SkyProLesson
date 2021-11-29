package sky.pro_lesson_10_1;

import java.util.Objects;

public class Book {
    private int publicationYear;
    private Author author;


    public Book(int publicationYear, String firstName, String surname) {
        this.publicationYear = publicationYear;
        author = new Author(firstName, surname);
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return author.aboutAuthor() + " " + "Год публикации: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublicationYear() == book.getPublicationYear() &&
                Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPublicationYear(), getAuthor());
    }
}
