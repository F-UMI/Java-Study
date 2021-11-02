package chap12_MULT_THREAD.sec07.exam01_daemon_thread;

public class AutoSaveThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                break;
            }
            save();
        }
    }

    public void save() {
        System.out.println("작업 내용을 저장함");


    }
}
