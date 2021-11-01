package chap12_MULT_THREAD.sec02_exam02_ThreadName;

public class ThreadB extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 2; i++){
            System.out.println(getName()+ "가 출력한내용");

        }
    }
}
