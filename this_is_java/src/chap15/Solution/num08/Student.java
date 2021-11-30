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
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return studentNum == student.studentNum && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentNum, name);
  }
}
