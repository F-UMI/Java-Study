package chap12_MULT_THREAD.sec06.exam02_yield;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            threadA.work = false;
        }

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
        threadA.stop = true;
        threadB.stop = true;
        }
    }


}
