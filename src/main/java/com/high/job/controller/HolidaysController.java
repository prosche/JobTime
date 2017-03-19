package com.high.job.controller;

import com.high.job.entity.Holidays;
import com.high.job.response.HolidaysResponse;
import com.high.job.services.HolidaysServer;
import com.high.job.util.UrlMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
@RestController
public class HolidaysController {

    @Autowired
    private HolidaysServer holidaysServer;

    /**
     * get month's holidays which is the input information
     *
     * @param month
     * @return
     */
    @RequestMapping(value = UrlMapping.GET_HOLIDAYS_PATH, method = RequestMethod.POST)
    @ResponseBody
    public List<HolidaysResponse> getMonthHolidays(final @PathVariable("month") @Valid Integer month){
        List<Holidays> lists = holidaysServer.getMonthHolidays(month);
        List<HolidaysResponse> results = new ArrayList<HolidaysResponse>();
        if(lists != null){
            lists.stream().forEach(list -> results.add(new HolidaysResponse(list.getOpMonth(), list.getUsers().getId(), list.getUsers().getName(),
                    list.getUsers().getEnglishName(), list.getUsers().getCompact(), list.getAllAnnualLeave(),
                    list.getUsedAnnualLeave(), list.getUnusedAnnualLeave(), list.getAllSickLeave(),
                    list.getUsedSickLeave(), list.getUnusedSickLeave()))
            );
        }
        return results;
    }
}
