package chap13_Generic_Type.sec07.exam01_generic_extends_implements;

public interface Storage <T>{
    public void add(T item, int index);
    public T get(int index);
}
