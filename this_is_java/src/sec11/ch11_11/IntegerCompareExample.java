package sec11.ch11_11;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2); //true
        System.out.println(obj3 == obj4); //false ? : 참조하는 포장 객체가 서로 다르기 때문이다.

    }

}
