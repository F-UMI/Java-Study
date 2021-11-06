package chap13_Generic_Type.sec07.exam01_generic_extends_implements;

public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company; //자식 파라미터로 더 얻을 수 있다.

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
