package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 * @author yasiro01
 */
public class Laptop {
  private double price;
  private String manufacturer;
  private String color;

  public Laptop(String manufacturer, double price, String color) {
    this.price = price;
    this.manufacturer = manufacturer;
    this.color = color;
  }

  public double getPrice() {
    return price;
  }

  public String getManufacturer() {
    return manufacturer;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setPrice(double price) {
      this.price = price;
  }
  
  public void setColor(String color) {
      this.color = color;
  }

  @Override
  public String toString() {
    return String.format("%s laptop by %s costs $%.2f", color, manufacturer, price);
  }
}
