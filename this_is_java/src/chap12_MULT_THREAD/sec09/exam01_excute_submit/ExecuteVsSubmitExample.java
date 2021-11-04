package chap12_MULT_THREAD.sec09.exam01_excute_submit;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
    public static void main(String[] args) throws  InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("작업 처리 스레드 이름" + threadName+ "   총 스레드 수"+ poolSize);
                    int value = Integer.parseInt("삼");
                }
            };
//            executorService.execute(runnable);
            executorService.submit(runnable);
            Thread.sleep(10);
        }
        executorService.shutdown();
    }
}
