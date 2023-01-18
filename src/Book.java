import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;


    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                name.equals(book.name) &&
                author.equals(book.author);
    }


    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }


    public String toString() {
        return name + " by " + author.toString() + " in " + publicationYear;
    }
}
