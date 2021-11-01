package sky.pro_lesson_9_1;
/*
## Минимальный **уровень**
1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
3. Написать конструкторы для обоих классов, заполняющие все поля.
4. Создать геттеры для всех полей автора и всех полей книги.
5. Создать сеттер для поля «Год публикации» у книги.
6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух)
и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
    Метод main не должен находиться в классах Book и Author.
    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
 */

public class Book {
    private int publicationYear;
    private Author author;

    public Book(int publicationYear, String firstName, String surname) {
        this.publicationYear = publicationYear;
        author = new Author(firstName, surname);
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void aboutBook() {
        System.out.println("Год публикации: " + publicationYear + " " + author.aboutAuthor());
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setNewSurname(String surname) {
        this.author.setSurname(surname);
    }
}
