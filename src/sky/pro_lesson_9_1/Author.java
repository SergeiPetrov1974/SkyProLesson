package sky.pro_lesson_9_1;

public class Author {
    private String firstName;
    private String surname;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String aboutAuthor() {
        return "Фамилия автора: " + surname
                + " Имя автора: " + firstName;
    }
}
