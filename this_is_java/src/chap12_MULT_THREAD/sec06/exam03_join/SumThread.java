package chap12_MULT_THREAD.sec06.exam03_join;

public class SumThread extends Thread {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
    }
}
