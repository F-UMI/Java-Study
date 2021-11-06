package chap13_Generic_Type.Solution.Num02;

public class Container<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
