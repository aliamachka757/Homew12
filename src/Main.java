public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jane", "Doe");
        Author author2 = new Author("John", "Smith");

        Book book1 = new Book("Book 1", author1, 2010);
        Book book2 = new Book("Book 2", author2, 2012);

        book1.setPublicationYear(2015);

        System.out.println("The book " + book1.getName() + " was published in " + book1.getPublicationYear() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("The book " + book2.getName() + " was published in " + book2.getPublicationYear() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
    }
}
