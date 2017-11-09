package exercise5;

/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author yasiro01
 */
public class Company {
    private String company;
    private double stockPrice;
    
    public Company(String company, double stockPrice) {
        this.company = company;
        this.stockPrice = stockPrice;
    }
    
    public String getName() {
    return company;
  }

  public double getStockPrice() {
    return stockPrice;
  }
  
  public void setStockPrice(double stockPrice) {
      this.stockPrice = stockPrice;
  }
  
  @Override
  public String toString() {
    return String.format("%s trading at $%.2f", company, stockPrice);
  }
}
