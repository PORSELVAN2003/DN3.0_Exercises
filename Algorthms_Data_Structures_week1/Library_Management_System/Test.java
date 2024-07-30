import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Book[] books = {
            new Book(1, "Learn Java", "telusky"),
            new Book(2, "Learn DSA", "seoul"),
            new Book(3, "Learn Python", "Rossum")
        };

        LibraryManager manager = new LibraryManager(books);

        System.out.println("\nBook to be found by title : Learn Java");

        System.out.println("\nLinear Search:");
        Book book = manager.linearSearchByTitle("Learn Java");
        System.out.println(book != null ? book : "Book not found");

        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        System.out.println("\nBinary Search:");
        book = manager.binarySearchByTitle("Learn Java");
        System.out.println(book != null ? book : "Book not found");
    }
}
