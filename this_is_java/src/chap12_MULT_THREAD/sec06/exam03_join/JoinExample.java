package chap12_MULT_THREAD.sec06.exam03_join;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch(InterruptedException e) {

        }
        //계산중 출력하는시도 - 막기위해 출력전 합산이 완료될수있게 스레드 종료후 호출
        System.out.println("1~100합: " + sumThread.getSum());

    }
}
