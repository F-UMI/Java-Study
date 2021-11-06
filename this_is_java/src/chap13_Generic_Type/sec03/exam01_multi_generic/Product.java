package chap13_Generic_Type.sec03.exam01_multi_generic;

public class Product<T,M> {
    private T kind;
    private M Model;

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return Model;
    }

    public void setModel(M model) {
        Model = model;
    }
}
