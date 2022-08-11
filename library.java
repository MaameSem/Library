import java.util.List;
import java.util.ArrayList;


public class Library {
    // Add the missing implementation to this class

	private String address;
	private List<Book> available = new ArrayList<>();
	
	Library(String address) {
		this.address = address;
	}
	
	public void addBook(Book book) {
		available.add(book);
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9 a.m. to 5 p.m.");
	}
	
	public void printAddress() {
		System.out.println(this.address);
	}
	
	public void borrowBook(String title) {
		for (Book item : available) {
			if (item.title == title) {
				if (!item.borrowed) available.remove(item);
				break;
			}
		}
	}
	
	public void returnBook(String title) {
		available.add(new Book(title));
	}
	
	public void printAvailableBooks() {
		for (Book item : available) {
			System.out.println(item.title);
		}
	}
	
    public static void main(String[] args) {
    	
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("Harry Potter"));
        firstLibrary.addBook(new Book("Snow White"));
        firstLibrary.addBook(new Book("50 Shades of Grey"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow Harry Potter from both libraries
        System.out.println("Borrowing Harry Potter:");
        firstLibrary.borrowBook("Harry Potter");
        firstLibrary.borrowBook("Harry Potter");
        secondLibrary.borrowBook("Harry Potter");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return Harry Potter to the first library
        System.out.println("Returning Harry Potter:");
        firstLibrary.returnBook("Harry Potter");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

    }

} 
