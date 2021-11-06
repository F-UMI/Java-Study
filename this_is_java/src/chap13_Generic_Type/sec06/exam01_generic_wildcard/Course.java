package chap13_Generic_Type.sec06.exam01_generic_wildcard;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        students = (T[]) new Object[capacity]; //강제 타입 변환
    }

    public T[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void add(T t) {
        for (int i = 0; i < students.length; i++){
            if(students[i] == null) // students에서 비어있는 부분부터 차례로 자리 채움
            students[i] = t;
            break;
        }
    }
}
