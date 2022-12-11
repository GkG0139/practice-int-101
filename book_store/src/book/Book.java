package book;

public class Book {

  private int id;
  private static int latestId;

  private String name;
  private String author;

  private double price;

  public Book(String name, String author, double price) {
    id = latestId++;
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return (
      "Book [id=" +
      id +
      ", name=" +
      name +
      ", author=" +
      author +
      ", price=" +
      price +
      "]"
    );
  }
}
