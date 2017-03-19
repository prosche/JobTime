package com.high.job.util;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by yu.yang on 2017/3/19.
 */
public class DateTest {

    @Test
    public void dateTime(){
        System.out.println(String.valueOf(LocalDate.now().getYear()) +
                (String.valueOf(LocalDate.now().getMonthValue()).length() == 1 ? "0"+String.valueOf(LocalDate.now().getMonthValue()) : String.valueOf(LocalDate.now().getMonthValue())));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMM");

        LocalDateTime date =LocalDateTime.now();
        String str = date.format(f);
        System.out.println(str);

        String day = "2015/9/10";
        String[] days = day.split("/");
        LocalDate start = LocalDate.of(Integer.valueOf(days[0]), Integer.valueOf(days[1]), Integer.valueOf(days[2]));
//        Duration duration = Duration.between(start, LocalDate.now());
         ChronoUnit.DAYS.between(start, LocalDate.now());
        System.out.println(ChronoUnit.DAYS.between(start, LocalDate.now()));
//        date = LocalDateTime.parse(str,f);
    }
}
