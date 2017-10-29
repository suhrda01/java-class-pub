package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author suhrda01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }

    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    System.out.println();
    //task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void task1(int n) {
      System.out.println("--Task 1--");
      nHeads(n);
  }
  
  public static void nHeads(int n) {
      int heads = 0;
      while (heads != n) {
        Random rnd = new Random(); 
        int result = rnd.nextInt(2);
        if (result == 0){
            heads ++;
            System.out.println("Heads");
        } else {
            heads = 0;
            System.out.println("Tails");
        }
      }
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
    System.out.println("--Task 2--");
    boolean larger=true;
    for (int i=0; i<arr.length; i++) {
        if (arr[i]>n) {
            larger=false;
            break;
        }
    }
    System.out.println();
    return larger;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold 
   * @return
   */                                                                                                                                                                                                                       
  public static int task3(int[] arr, int threshold) {
    System.out.println("--Task 3--");
    int below = 0;
    for (int i=0; i<arr.length; i++) {
        if (arr[i]<threshold) {
            below++;
        }
    }
    System.out.println();
    return below;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
    System.out.println("--Task 4--");
    int max=0;
    for (int i=1; i<(arr.length-1); i++) {
        if (arr[i-1]<arr[i]) {
            max=arr[i];
        }
    }
    int difference=(100-max);
    for (int i=0; i<arr.length; i++) {
        arr[i] += difference;
    } 
    System.out.println();
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
      System.out.println("--Task 5--");
      int aStudent=0, bStudent=0, cStudent=0, dStudent=0, fStudent=0;
      for (int item: arr){
          if (item>=90){
              aStudent++;
          } else if (item>=80){
              bStudent++;
          } else if (item>=70){
              cStudent++;
          } else if (item>=60){
              dStudent++;
          } else if (item>=0){
              fStudent++;
          }
      }
      System.out.printf("%-10s%10s%n", "Grade", "# of Students");
      System.out.printf("%-10s%5d%n", "A", aStudent);
      System.out.printf("%-10s%5d%n", "B", bStudent);
      System.out.printf("%-10s%5d%n", "C", cStudent);
      System.out.printf("%-10s%5d%n", "D", dStudent);
      System.out.printf("%-10s%5d%n", "F", fStudent);
      System.out.println();
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    System.out.println("--Task 6--");
    ArrayList<Double> arr = new ArrayList();
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter a number(0 to exit)%n");
    Double input = keyboard.nextDouble();
    while (input != 0) {
        arr.add(input);
        System.out.printf("Enter a number(0 to exit)%n");
        input = keyboard.nextDouble();
    }
    System.out.println(arr);
    System.out.println();
  }
  
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
   System.out.println("--Task 7--");
   Random rnd = new Random();
   rnd.setSeed(252);
   ArrayList<Integer> rndList = new ArrayList();
    for (int i = 0; i < 10; i++) {
      rndList.add(rnd.nextInt((100 - 50)+1)+ 50);
      System.out.println(rndList.get(i) + "  ");
    }
    System.out.println();
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.println("--Task 8--");
    int below = 0;
    for (int i=0; i<arrLst.size(); i++) {
        if (arrLst.get(i)<threshold) {
            below++;
        }
    }
    System.out.println();
    return below;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    System.out.println("--Task 9--");
    int[][] matrix = new int[10][10];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = (i+1) * (j+1);
        System.out.printf("%5s", matrix[i][j]);
      }
      System.out.println("");
    }
    System.out.println();
    return matrix;
  }
  
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    System.out.println("--Task 10--");
    int[] columnTotal = new int[matrix[0].length];
    for (int row = 0; row < matrix.length; row++) {
        int rowTotal = 0;
      for (int column = 0; column < matrix[0].length; column++) {
        rowTotal += matrix[row][column];
        columnTotal[column] += matrix[row][column];
      }
      System.out.println("Row " + (row+1) + ": "+ rowTotal);
    }
    for (int i = 0; i < columnTotal.length; i++){
       System.out.println("Column " + (i+1) + ": "+ columnTotal[i]); 
    }
  }
}
