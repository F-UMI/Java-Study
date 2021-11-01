package chap12_MULT_THREAD.sec06.exam06_stop;

public class PrintThread2 extends Thread{
    @Override
    public void run() {
/*        try {
          while (true) {
              System.out.println("실행중");
                Thread.sleep(1);
            }
        } catch(InterruptedException e) {
        }*/
        System.out.println("실행중");
        while (true) {
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("자원정리");
        System.out.println("실행종료 ");
    }
}
