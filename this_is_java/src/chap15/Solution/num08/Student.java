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
      Student student = (Student) o;
      if (studentNum == student.studentNum && name == student.name) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return studentNum + name.hashCode();
  }
}
