package sky.pro_lesson_9_3;

public class Author {
    private int publicationYear;
    private String surname;
    private String firstName;

    public Author(String surname, String firstName, int publicationYear) {
        this.surname = surname;
        this.firstName = firstName;
        this.publicationYear = publicationYear;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
