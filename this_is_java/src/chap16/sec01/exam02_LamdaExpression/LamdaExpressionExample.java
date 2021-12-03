package chap16.sec01.exam02_LamdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionExample {

  public static void main(String[] args) {
    List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("신용권", 92));
    Stream<Student> stream = list.stream();
    stream.forEach(student -> {
          String name = student.getName();
          int score = student.getScore();
          System.out.println(name + ":" + score);
        }
    );
  }
}
