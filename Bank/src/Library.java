import java.util.*;

public class Library {
    private String name;
    private String address;
    private List<BookCopy> bookCopies;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.bookCopies = new ArrayList<>();
    }

    public void addBook(BookCopy bookCopy) {
        this.bookCopies.add(bookCopy);
    }
}
