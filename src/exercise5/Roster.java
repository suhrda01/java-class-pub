package exercise5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author yasiro01
 */
public class Roster {
    private ArrayList<Student> studentList = new ArrayList();

    public Roster(String filename) throws FileNotFoundException, IOException {
        File inputFile = new File(filename);
        Scanner lineContent = new Scanner(inputFile);
        while (lineContent.hasNextLine()) {
            String line = lineContent.nextLine();
            String[] lineSplit = line.split(",");
            Student student = new Student(lineSplit[0], lineSplit[1], Double.parseDouble(lineSplit[2]));
            studentList.add(student);
        }
    }
    
    public String printRoster() {
        String roster = "";
        for (Student person : studentList) {
            roster = roster + (person.toString() + "\n");
        }
        return roster;
    }
}