package chap12_MULT_THREAD.sec09.exam04_completion_service;

import java.util.concurrent.*;

public class CompletionServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        CompletionService completionService = new ExecutorCompletionService(executorService);

        System.out.println("작업처리요청");
        for (int i = 0; i < 3; i++){
            completionService.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    int sum = 0;
                    for (int i = 1; i <= 10; i++){
                        sum += i;
                    }
                    return sum;
                }
            });
        }
        System.out.println("처리 완료된 작업 확인");
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("처리결과" + value);
                    } catch(Exception e) {
                        break;
                    }
                }
            }
        });
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            executorService.shutdown();
        }
    }
}
