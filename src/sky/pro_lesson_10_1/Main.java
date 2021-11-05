package sky.pro_lesson_10_1;


public class Main {
    /*
    Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
    Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать)
    его версию метода.
- **Критерии оценки**
    – Метод toString реализован корректно.
    – Метод equals реализован корректно.
    – Метод hashCode реализован корректно.
    – Методы не дублируют друг друга в классах Author и Book.
     */
    public static void main(String[] args) {
        Book book = new Book(201, "Sergei", "Petrov");
        Book book1 = new Book(2001, "Sergei", "Petrov");
        System.out.println(book.equals(book1));


        Author author1 = new Author("Serge", "Petrov");
        Author author2 = new Author("Sergei", "Petrov");
        //System.out.println(author1.equals(author2));

    }
}
