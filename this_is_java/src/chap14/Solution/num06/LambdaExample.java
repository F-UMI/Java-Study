package chap14.Solution.num06;

import java.util.function.ToIntFunction;

public class LambdaExample {
    private static Student[] students = {
            new Student("홍길동",90,96),
            new Student("신용권",95,93)
    };

    public static double avg(ToIntFunction<Student> function) {
        int sum = 0, count = 0;
        for (Student student : students){
            sum = sum + function.applyAsInt(student);
            count++;
        }
        return (double) sum / count;

    }

    public static void main(String[] args) {
//        double englishAvg = avg(value -> value.getEnglishScore());
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("englishAvg = " + englishAvg);

//        double mathAvg = avg(value -> value.getMathScore());
        double mathAvg = avg(Student::getMathScore);
        System.out.println("mathAvg = " + mathAvg);


    }
}
