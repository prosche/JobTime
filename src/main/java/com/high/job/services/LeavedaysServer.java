package com.high.job.services;

import com.high.job.entity.Leavedays;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
public interface LeavedaysServer {
    Boolean deleteLeaveday(Integer uuid);

    int addLeavedays(Leavedays leavedays);

    List<Leavedays> getLeavedaysByMonth(String month);
}
