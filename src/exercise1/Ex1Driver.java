package exercise1;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/**
 * @author suhrda01
 * @assignment exercise1
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    for (int i = 1; i < 101; i++){
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("huh");
        } else if (i % 3 == 0) {
          System.out.println("foo");
        } else if (i % 5 == 0) {
          System.out.println("bar");
        } else {
          System.out.println(i);
        }
    }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    int total = 0;
    for (int i = 1; i < 101; i++){
        if (i % 7 == 0){
           total += i;
        }
    }
    System.out.println(total);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    int sum = 0;
    long product = 1;
    for (int i = 1; i < 21; i++) {
        sum += i;
        product = product * i;
    }
    System.out.print("The sum is ");
    System.out.println(sum);
    System.out.print("The product is ");
    System.out.println(product);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter your full name%n");
    String fullName = keyboard.nextLine();
    String[] strArray = fullName.split(" ");
    String initials = "";
    for (int i = 0; i < strArray.length; i++) {
        char initial = strArray[i].charAt(0);
        initials += initial;
    }
    System.out.println("Your initials are " + initials);
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    int[] cubeNums = new int[10];
    for (int i = 0; i < 10; i++){
        cubeNums[i] = i * i * i;
        System.out.print(cubeNums[i] + "  ");
    }
    System.out.println("");
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] randomNumbers = new int[100];
    for (int i = 0; i < randomNumbers.length; i++){
        
    }
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter a number between 1 and 100%n");
    int inputNum = keyboard.nextInt();
    boolean found = false;
    for (int i = 0; i < 100; i++){
        if (randomNumbers[i] == inputNum) {
            found = true;
            break;
        }
    }
    if (found == true){  
    System.out.println(inputNum + " was found in the array!");
    } else {
        System.out.println(inputNum + " was not found in the array.");
    }
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++){
        sum += numbers[i];
    }
    System.out.println("The sum of the integers in this array is " + sum);
    return sum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter a word%n");
    String inputWord = keyboard.nextLine();
    boolean inOrder = true;
    for (int i = 0; i < (inputWord.length() - 1); i++){
        int ascii1 = (int) inputWord.charAt(i);
        int ascii2 = (int) inputWord.charAt(i + 1);
        if (ascii1 > ascii2){
            inOrder = false;
            break;
        }
    }
    System.out.println(inOrder);
    return inOrder;
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
      boolean[] isComposite = new boolean[100 + 1];
      for (int i = 2; i <= 10; i++) {
            if (!isComposite[i]) {
                  System.out.print(i + " ");
                  for (int k = i * i; k <= 100; k += i)
                        isComposite[k] = true;
            }
      }
      for (int i = 10; i <= 100; i++)
            if (!isComposite[i])
                  System.out.print(i + " ");
  }

}
