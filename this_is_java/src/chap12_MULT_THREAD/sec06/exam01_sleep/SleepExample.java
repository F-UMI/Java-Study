package chap12_MULT_THREAD.sec06.exam01_sleep;

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++){
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
