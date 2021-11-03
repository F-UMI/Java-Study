package chap12_MULT_THREAD.sec08.exam01_threadgroup;


import chap12_MULT_THREAD.sec07.exam01_daemon_thread.AutoSaveThread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads){
            System.out.println("Name:" + thread.getName() + (thread.isDaemon() ? "(데몬)" : "주"));
            System.out.println("\t" + "소속그룹" + thread.getThreadGroup().getName());
        }
    }

}
