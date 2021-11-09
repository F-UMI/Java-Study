package chap14.sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동","남자",90),
            new Student("김순희","여자",90),
            new Student("감자바","남자",95),
            new Student("박한나","여자",92)
    );

    private static double avg(Predicate<Student> predicate) {
        int count = 0;
        int sum = 0;
        for (Student student : list){
            if(predicate.test(student)) {
                count++;
                sum += student.getScore();
            }

        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals("남자"));
        System.out.println("남자의 평균" + maleAvg);

        double femaleAvg = avg(t -> t.getSex().equals("여자"));
        System.out.println("여자의 평균" + femaleAvg);
    }
}
