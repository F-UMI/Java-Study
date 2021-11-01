package chap12_MULT_THREAD.sec06.exam04_wait_notify;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread A 의 methodA() 작업실행");
        notify();
        try {
            wait();
        } catch(InterruptedException e) {
        }
    }
    public synchronized void methodB() {
        System.out.println("Thread B 의 methodB() 작업실행");
        notify();
        try {
            wait();
        } catch(InterruptedException e) {
        }
    }
}
