package chap15.Solution.num08;

import java.util.Objects;

public class Student {

  public int studentNum;
  public String name;

  public Student(int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Student) {
      if (((Student) o).studentNum == this.studentNum) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentNum, name);
  }
}
