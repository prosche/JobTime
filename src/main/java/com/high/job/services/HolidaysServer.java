package com.high.job.services;

import com.high.job.entity.Holidays;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
public interface HolidaysServer {
    List<Holidays> getMonthHolidays(Integer month);
}
