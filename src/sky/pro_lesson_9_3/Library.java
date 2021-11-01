package sky.pro_lesson_9_3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Author> authors = new ArrayList<>();

    public void add(String surname, String firstName, int publicationYear) {
        authors.add(new Author(surname, firstName, publicationYear));
    }

    public void changeFirstName(String firstName) {
        for (int i = 0; i < authors.size(); i++) {
            authors.get(i).setFirstName(firstName);
        }
    }

    public void removeSurname(String surname) {
        for (int i = 0; i < authors.size(); i++) {
            if (surname.toLowerCase().equals(authors.get(i).getSurname().toLowerCase())) {
                authors.remove(i);
                i--;
            }
        }
    }

    public void changeYearBySurname(String surname, int newYear) {
        for (int i = 0; i < authors.size(); i++) {
            if (surname.toLowerCase().equals(authors.get(i).getSurname().toLowerCase())) {
                authors.get(i).setPublicationYear(newYear);
            }
        }
    }


    public void show() {
        for (int i = 0; i < authors.size(); i++) {
            System.out.println("Книга автора " + authors.get(i).getSurname() + " " + authors.get(i).getFirstName() +
                    " была опубликована в " + authors.get(i).getPublicationYear());
        }
    }
}