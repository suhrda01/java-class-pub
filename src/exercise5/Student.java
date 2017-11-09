package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author yasiro01
 */
public class Student {
  private double gpa;
  private String name;
  private String major;

  public Student(String name, String major, double gpa) {
    this.name = name;
    this.major = major;
    this.gpa = gpa;
  }

  public double getGpa() {
    return gpa;
  }

  public String getName() {
    return name;
  }
  
  public String getMajor() {
    return major;
  }
  
  public void setMajor(String major) {
    this.major = major;
  }
  
  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return String.format("%s is majoring in %s with a GPA of %.1f", name, major, gpa);
  }
}
