package exercise11;

import java.util.Collection;
import java.util.Collections;

/**
 * Exercise 11 logic
 * @author suhrda01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
  public <T> int strLen(T item) {
      return item.toString().length();
  }
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  public <T extends Comparable> T greater(T item1, T item2, T item3){
      if (item1.compareTo(item2) >= 0) {
          if (item1.compareTo(item3) >= 0) {
              return item1;
          } else {
              return item3;
          }
      } else if (item2.compareTo(item3) >= 0) {
          return item2;
      } else {
          return item3;
      }
  }
  
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  public <T> void printList(T ... list) {
      for (T item: list) {
          System.out.print(item + " ");
      }
  }
  
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
  public <T extends Comparable> Comparable findMinItem(Collection<T> list){
      return Collections.min(list);
  } 
}

  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
  class Foo<T,U> {
      private T fuzz;
      private U buzz;
      
      public Foo(T fuzz, U buzz) {
          this.fuzz = fuzz;
          this.buzz = buzz;
      }

    public T getFuzz() {
        return fuzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public U getBuzz() {
        return buzz;
    }

    public void setBuzz(U buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
      
      
  }
