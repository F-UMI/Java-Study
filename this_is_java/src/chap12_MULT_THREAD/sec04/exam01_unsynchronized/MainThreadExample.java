package chap12_MULT_THREAD.sec04.exam01_unsynchronized;

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 =  new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
        // 공유객체 사용으로 인한 실행 결과 오류 50 50
    }
}
