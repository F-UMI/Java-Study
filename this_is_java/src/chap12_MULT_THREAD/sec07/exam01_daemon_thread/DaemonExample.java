package chap12_MULT_THREAD.sec07.exam01_daemon_thread;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
        }
        System.out.println("메인 스레드 종료");
    }
    
}
