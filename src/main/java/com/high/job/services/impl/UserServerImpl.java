package com.high.job.services.impl;

import com.high.job.entity.Holidays;
import com.high.job.entity.Users;
import com.high.job.mapper.HolidaysMapper;
import com.high.job.mapper.UsersMapper;
import com.high.job.request.UserRequest;
import com.high.job.services.UserServer;
import com.high.job.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
@Service
public class UserServerImpl implements UserServer {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private HolidaysMapper holidaysMapper;

    @Override
    public List<Users> getUsedAllUsers(){
        return usersMapper.findOnDutyAll();
    }

    @Override
    public int addUser(UserRequest userRequest){
        int resultUsers = usersMapper.insertMap(requestToUsers(userRequest));
        int resultHolidays = holidaysMapper.insertMap(requestToHolidays(userRequest));
        return resultHolidays == 1 && resultUsers == 1 ? 1 : 0;
    }

    @Override
    public Boolean deleteUser(Integer id){
        return usersMapper.delete(id);
    }

    private Users requestToUsers(UserRequest userRequest){
        Users user = new Users();
        user.setId(userRequest.getId());
        user.setName(userRequest.getName());
        user.setEnglishName(userRequest.getEnglishName());
        user.setCompact(userRequest.getCompact());
        return user;
    }

    private Holidays requestToHolidays(UserRequest userRequest){
        Holidays holidays = new Holidays();
        holidays.setOpMonth(DateUtil.getNowMonth());
        holidays.setUserId(userRequest.getId());

        if(userRequest.getCompact() != null) {
            holidays.setAllAnnualLeave(countAnnualLeaveDays(DateUtil.betweenTodayDays(userRequest.getCompact())));
            holidays.setUsedAnnualLeave(0.0);
            holidays.setUnusedAnnualLeave(countAnnualLeaveDays(DateUtil.betweenTodayDays(userRequest.getCompact())));
            holidays.setAllSickLeave(countSickLeaveDays(DateUtil.betweenTodayDays(userRequest.getCompact())));
            holidays.setUsedSickLeave(0.0);
            holidays.setUnusedSickLeave(countAnnualLeaveDays(DateUtil.betweenTodayDays(userRequest.getCompact())));
        } else {
            holidays.setAllAnnualLeave(0.0);
            holidays.setAllSickLeave(0.0);
        }

        return holidays;
    }

    private Double countAnnualLeaveDays(Long days){
        Double result = 0.0;
        if ((days / 30) >= 6 ){
            result = days / 30 * 0.83;
        }
        return result;
    }

    private Double countSickLeaveDays(Long days){
        Double result = 0.5;
        if ( days >= (365/12) ){
            result = days / (365/12) * 0.5;
        }
        return result;
    }
}
