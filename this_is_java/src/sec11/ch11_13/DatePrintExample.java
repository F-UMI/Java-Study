package sec11.ch11_13;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;


public class DatePrintExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = null;
        localDateTime = now.withYear(2024).withMonth(5).withDayOfMonth(8).withHour(10).withMinute(30);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 mm월 dd일 E요일 kk시 mm분");
        String strDate = simpleDateFormat.format(localDateTime);
        System.out.println(strDate.toString());

    }

}
