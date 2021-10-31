package sec12_MULT_THREAD.sec03_exam01_ThreadPriority;

public class PriorityExample {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            Thread thread =new CalcThread("Thread" + (i+1) );
            if(i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
