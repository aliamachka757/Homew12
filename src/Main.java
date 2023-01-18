public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Jane", "Doe");
        Author author2 = new Author("John", "Smith");

        Book book1 = new Book("Book 1", author1, 2010);
        Book book2 = new Book("Book 2", author2, 2012);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        if (book1.equals(book2)) {
            System.out.println("book1 and book2 are equal");
        } else {
            System.out.println("book1 and book2 are not equal");
        }
    }
}