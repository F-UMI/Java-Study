package chap13_Generic_Type.sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + "수강생 :" + Arrays.toString(course.getStudents()));
    }

    public static void registerStudentCourse(Course<? extends Student> course) {
        System.out.println(course.getName() + "수강생 :" + Arrays.toString(course.getStudents()));
    }

    public static void registerWorkerCourse(Course<? super Worker> course) {
        System.out.println(course.getName() + "수강생 :" + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생 과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new Student("고등학생"));


        Course<HighStudent> highStudentCourse = new Course<>("학생 과정", 5);
        highStudentCourse.add(new HighStudent("학생"));
        highStudentCourse.add(new HighStudent("고등학생"));


        registerCourse(personCourse);
        registerCourse(studentCourse);
        registerCourse(workerCourse);
        registerCourse(highStudentCourse);
        System.out.println();


//        registerStudentCourse(personCourse);
        registerStudentCourse(studentCourse);
//        registerStudentCourse(workerCourse);
        registerStudentCourse(highStudentCourse);
        System.out.println();

        registerWorkerCourse(personCourse);
//        registerWorkerCourse(studentCourse);
        registerWorkerCourse(workerCourse);
//        registerWorkerCourse(highStudentCourse);
        System.out.println();
    }
}

