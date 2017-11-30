package exercise10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author suhrda01
 */
public class BookShop {
    ArrayList<Book> catalog;

  public BookShop() {
      catalog = new ArrayList();
  }
  
  public BookShop(String filename) throws FileNotFoundException {
      this();
      try {
        File inputFile = new File(filename);
        Scanner lineContent = new Scanner(inputFile);
        while (lineContent.hasNextLine()) {
            String line = lineContent.nextLine();
            String[] lineSplit = line.split(",");
            Book newBook = new Book(lineSplit[0], lineSplit[1], Double.parseDouble(lineSplit[2]), Integer.parseInt(lineSplit[3]));
            this.catalog.add(newBook);
        }    
        } catch(FileNotFoundException f) {
            System.out.println("File not found");
        }

  }
  
  public BookShop(BookShop anotherBookShop) {
      this();
      for (Book b: anotherBookShop.catalog) {
          this.catalog.add(b);
      }
  }
  
  public void addNewTitle(Book book) {
      this.catalog.add(book);
  }
  
  public int size() {
      return this.catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
      for (Book b: this.catalog){
          b.setPrice(b.getPrice() * (discountPercent/100.0));
      }
  }
  
  public void printCatalog() {
      for (Book b: this.catalog) {
          System.out.println(b);
      }
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return this.catalog;
  }

}
