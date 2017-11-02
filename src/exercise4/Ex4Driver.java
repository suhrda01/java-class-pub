package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author yasiro01
 */
public class Ex4Driver {
  /*
  Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
    public Integer task1(Integer n) {
        return n * 2;
    }
  /*
Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
    public Integer task2(String text) {
        return text.length();
    }
  /*
Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
    public Integer task3(Character letter){
        return letter.hashCode();
    }
  /*
Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity.
  */
    public Character task4(String text) {
        return text.charAt(0);
    }
  /*
Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
    public Integer task5(Integer n, Integer m) {
        return n * m;
    }
  /*
Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity.
  */
    public Character task6(String text, Integer n) {
        if (text.length() > n){
            return text.charAt(n);
        } else {
            return text.charAt(0);
        } 
    }
    
  /*
Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
    public Integer task7(Integer[] intArr) {
        return intArr.length;
    }
  /*
Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity.
  */
    public Boolean task8(Integer[] intArr, Integer n) {
        return intArr.length > n;
    }
  /*
Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
    public Integer task9(ArrayList<String> arrList) {
        return arrList.size();
    }
  /*
Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
    public Integer task10(HashMap<Integer, Integer> hash) {
        return hash.size();
    }
}
