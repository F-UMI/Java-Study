package chap12_MULT_THREAD.sec06.exam06_stop;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
        }
        printThread1.setStop(true);
    }
}