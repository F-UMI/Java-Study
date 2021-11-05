package chap12_MULT_THREAD.sec09.exam03_save_extanal_object;

import javax.xml.transform.Result;
import java.util.concurrent.*;

public class ResultByRunnableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        System.out.println("작업처리요청");
        class Task implements Runnable {
            Result result;
            public Task(Result result) {
                this.result = result;
            }
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++){
                    sum += i;
                }
                result.AddValue(sum);
            }
        }
        Result result = new Result();
        Runnable task1 = new Task(result);
        Runnable task2 = new Task(result);
        Future<Result> future1 = executorService.submit(task1, result);
        Future<Result> future2 = executorService.submit(task2, result);

        try {
            result = future1.get();
            result = future2.get();
            System.out.println("처리 결과  " + result.accumValue);
            System.out.println("작업 처리 완료 ");
        } catch(Exception e) {
            System.out.println("실행 예외가 발생함" + e.getMessage());
        }
    }

    static class Result {
        int accumValue;
        synchronized void AddValue(int value) {
            accumValue += value;
        }
    }
}
