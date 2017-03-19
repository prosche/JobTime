package com.high.job.controller;

import com.high.job.entity.Leavedays;
import com.high.job.response.LeavedaysReponse;
import com.high.job.services.LeavedaysServer;
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
public class LeavedaysController {

    @Autowired
    private LeavedaysServer leavedaysServer;

    @RequestMapping(value = UrlMapping.CREATE_LEAVEDAYS_PATH, method = RequestMethod.POST)
    @ResponseBody
    public int addLeaveday(final @RequestBody @Valid LeavedaysReponse leavedaysReponse){
        int result = 0;
        if(leavedaysReponse != null){
            result = leavedaysServer.addLeavedays(requestToLeavedays(leavedaysReponse));
        };
        return result;
    }

    @RequestMapping(value = UrlMapping.DELETE_LEAVEDAYS_PATH, method = RequestMethod.POST)
    @ResponseBody
    public Boolean deleteLeaveday(final @PathVariable("uuid") @Valid Integer uuid){
        return leavedaysServer.deleteLeaveday(uuid);
    }


    @RequestMapping(value = UrlMapping.GET_LEAVEDAYS_PATH, method = RequestMethod.POST)
    @ResponseBody
    public List<LeavedaysReponse> getMonthLeaveday(final @PathVariable("month") @Valid String month){
        List<Leavedays> lists = leavedaysServer.getLeavedaysByMonth(month);
        List<LeavedaysReponse> results = new ArrayList<LeavedaysReponse>();
        if(lists != null){
            lists.stream().forEach(list -> results.add(new LeavedaysReponse(list.getUuid(), list.getUsers().getId(), list.getUsers().getName(),
                    list.getUsers().getEnglishName(), list.getUsers().getCompact(), list.getLeaveDay(),
                    list.getLeaveTime(), list.getReasonId(), list.getReason(), list.getCreateDate(),
                    list.getDealDate(), list.getStatus()))
            );
        }
        return results;
    }

    private Leavedays requestToLeavedays(LeavedaysReponse leavedaysReponse){
        Leavedays leavedays = new Leavedays();
        leavedays.setUserId(leavedaysReponse.getUserId());
        leavedays.setLeaveDay(leavedaysReponse.getLeaveDay());
        leavedays.setLeaveTime(leavedaysReponse.getLeaveTime());
        leavedays.setReasonId(leavedaysReponse.getReasonId());
        return leavedays;
    }
}
