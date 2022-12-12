import book.Book;
import java.util.Arrays;
import store.BookStore;

public class App {

  public static void main(String[] args) throws Exception {
    testBook();
    testStore();
    testStoreAddBook();
    testStoreRemoveBook();
    testStoreGetAllBooks();
  }

  private static void testBook() {
    Book book = new Book("Harry Panner", "JJ. Ablamham", 999);
    System.out.println(book);
    System.out.println("===========");
  }

  private static void testStore() {
    BookStore store = new BookStore("Comic Book Stores", 10);
    System.out.println(store);
    System.out.println("===========");
  }

  private static void testStoreAddBook() {
    BookStore store = new BookStore("9In", 10);
    for (int i = 0; i <= 3; i++) {
      Book book = new Book("A" + i, "" + i, i * 100);
      store.addBook(book);
    }
    System.out.println(store);
    System.out.println("===========");
  }

  private static void testStoreRemoveBook() {
    BookStore store = new BookStore("9In", 10);
    for (int i = 0; i <= 3; i++) {
      Book book = new Book("A" + i, "" + i, i * 100);
      store.addBook(book);
      store.sellBook(book.getId());
    }
    System.out.println(store);
    System.out.println("===========");
  }

  private static void testStoreGetAllBooks() {
    BookStore store = new BookStore("9In", 10);
    for (int i = 0; i <= 10; i++) {
      Book book = new Book("A" + i, "" + i, i * 100);
      store.addBook(book);
    }
    System.out.println(Arrays.toString(store.getAllBooks()));
    System.out.println("===========");
  }
}
