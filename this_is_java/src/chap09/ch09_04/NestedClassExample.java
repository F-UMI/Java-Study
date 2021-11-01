package chap09.ch09_04;

public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire(); // 인스턴스 클래스는 해당 클래스를 감싸고 있는 클래스의 객체가 생성 되어야 선언이 가능하다
        Car.Engine engine = new Car.Engine(); // 정적 클래스는 감싸고 있는 클래스의 객체 필요없이 바로 선언이 가능하다.
    }
}
