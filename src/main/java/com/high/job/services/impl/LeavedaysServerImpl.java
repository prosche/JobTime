package com.high.job.services.impl;

import com.high.job.entity.Leavedays;
import com.high.job.mapper.LeavedaysMapper;
import com.high.job.services.LeavedaysServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */

@Service
public class LeavedaysServerImpl implements LeavedaysServer{
    @Autowired
    private LeavedaysMapper leavedaysMapper;

    @Override
    public Boolean deleteLeaveday(Integer uuid){
        Boolean result = leavedaysMapper.deleteLeaveday(uuid);
        return result == null ? false : result;
    }

    @Override
    public int addLeavedays(Leavedays leavedays){
        return leavedaysMapper.insertLeaveday(leavedays);
    }

    @Override
    public List<Leavedays> getLeavedaysByMonth(String month){
        return leavedaysMapper.findAllLeavedays(month);
    }
}
