package chap12_MULT_THREAD.sec03_exam01_ThreadPriority;

public class CalcThread extends Thread{
    public CalcThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000000000; i++){
        }
        System.out.println(getName());
    }
}
