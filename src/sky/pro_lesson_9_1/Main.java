package sky.pro_lesson_9_1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(2001, "Sergei", "Petrov");
        book.aboutBook();
        book.setPublicationYear(2002);
        book.aboutBook();
        book.setAuthor(new Author("Ivan", "Ivanov"));
        book.aboutBook();
        book.setNewSurname("Sokolov");
        book.setPublicationYear(1987);
        book.aboutBook();

    }
}
