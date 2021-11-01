package chap12_MULT_THREAD.sec04.exam01_unsynchronized;

public class User2 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User2");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(50);
        System.out.println(Thread.currentThread().getName() + ":" + calculator.getMemory());


    }
}
