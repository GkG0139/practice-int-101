package store;

import book.Book;
import java.util.Arrays;

public class BookStore {

  private int id;
  private int latestId;

  private String name;

  private Book[] books;
  private int size;

  public BookStore(String name, int size) {
    id = latestId++;
    this.name = name;
    this.books = new Book[size];
    this.size = size;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Book[] getBooks() {
    return books;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean addBook(Book book) {
    int duplicateCount = 0;
    int[] duplicateItems = new int[size];
    while (duplicateCount < size) {
      int rId = randomId();
      if (books[rId] == null) {
        books[rId] = book;
        return true;
      } else {
        if (duplicateItems[rId] == 0) {
          duplicateItems[rId] = 1;
          duplicateCount++;
        }
      }
    }
    return false;
  }

  private int randomId() {
    return random(size, 0);
  }

  private int random(int max, int min) {
    return (int) (Math.random() * (max - min) + min);
  }

  public boolean sellBook(int id) {
    for (int i = 0; i < size; i++) {
      if (books[i] != null && books[i].getId() == id) {
        books[i] = null;
        return true;
      }
    }
    return false;
  }

  public Book[] getAllBooks() {
    Book[] temp = new Book[size];
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (books[i] != null) {
        temp[count++] = books[i];
      }
    }
    Book[] result = new Book[count];
    for (int i = 0; i < count; i++) {
      result[i] = temp[i];
    }
    return result;
  }

  @Override
  public String toString() {
    return (
      "BookStore [id=" +
      id +
      ", latestId=" +
      latestId +
      ", name=" +
      name +
      ", books=" +
      Arrays.toString(books) +
      ", size=" +
      size +
      "]"
    );
  }
}
