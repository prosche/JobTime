package com.high.job.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by yu.yang on 2017/3/19.
 */
public class DateUtil {
    public static Integer getNowMonth(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMM");
        LocalDateTime date =LocalDateTime.now();
        return Integer.valueOf(date.format(f));
    }

    public static Long betweenTodayDays(String day){
        String[] days = day.split("/");
        return ChronoUnit.DAYS.between(LocalDate.of(Integer.valueOf(days[0]), Integer.valueOf(days[1]), Integer.valueOf(days[2])), LocalDate.now());
    }
}
