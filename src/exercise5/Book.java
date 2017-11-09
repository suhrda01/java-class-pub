package exercise5;

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author yasiro01
 */
public class Book {
  private double price;
  private String title;
  private String author;

  public Book(String title, String author, double price) {
    this.price = price;
    this.title = title;
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public String getTitle() {
    return title;
  }
  
  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return String.format("%s by %s costs %.2f", title, author, price);
  }
  
}
