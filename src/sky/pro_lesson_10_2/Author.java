package sky.pro_lesson_10_2;

import java.util.Objects;

public class Author {
    private String surname;
    private String firstName;

    public Author(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname) &&
                Objects.equals(firstName, author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, firstName);
    }

    @Override
    public String toString() {
        return "Author: " + surname + " " + firstName;
    }

    public void aboutAuthor() {
        System.out.println(surname + " " + firstName);
    }

}
