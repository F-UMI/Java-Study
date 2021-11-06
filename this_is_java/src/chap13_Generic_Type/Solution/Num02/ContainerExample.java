package chap13_Generic_Type.Solution.Num02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.set("홍길동");
        String s  = container1.get();

        Container<Integer> container2 = new Container<>();
        container2.set(6);
        int value = container2.get();

    }
}
