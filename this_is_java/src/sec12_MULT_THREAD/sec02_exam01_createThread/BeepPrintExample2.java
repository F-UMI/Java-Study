package sec12_MULT_THREAD.sec02_exam01_createThread;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        //비프음을 5번 반복해서 소리나게 하는 작업
        /* 1번 매개값
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();*/

        /* 2번 익명객체
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++){
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch(Exception e) {

                    }
                }
            }
        });*/
        //3. 람다식
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++){
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch(Exception e) {

                }
            }
        });
        //띵 문자열을 5번 출력하는 작업
        for (int i = 0; i < 5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch(Exception e) {

            }
        }

    }
}
