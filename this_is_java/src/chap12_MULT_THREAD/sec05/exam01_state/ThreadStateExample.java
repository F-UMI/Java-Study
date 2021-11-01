package chap12_MULT_THREAD.sec05.exam01_state;

public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }


}
