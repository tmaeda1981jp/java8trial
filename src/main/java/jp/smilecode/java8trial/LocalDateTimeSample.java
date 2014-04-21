package jp.smilecode.java8trial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSample {
    public static void main(String[] args) {
        
        // 日付
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        
        // 時間
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
        
        // 日付＋時間
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);
        
        System.out.println(datetime.format(
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        
    }
}
