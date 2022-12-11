package store;

import book.Book;

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
}
