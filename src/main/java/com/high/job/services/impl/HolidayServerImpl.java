package com.high.job.services.impl;

import com.high.job.entity.Holidays;
import com.high.job.mapper.HolidaysMapper;
import com.high.job.services.HolidaysServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
@Service
public class HolidayServerImpl implements HolidaysServer{
    @Autowired
    private HolidaysMapper holidaysMapper;

    @Override
    public List<Holidays> getMonthHolidays(Integer month){
        return holidaysMapper.findAllHolidaysByMonth(month);
    }
}
