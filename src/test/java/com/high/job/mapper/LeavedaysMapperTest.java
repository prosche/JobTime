package com.high.job.mapper;

import com.high.job.entity.Leavedays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yu.yang on 2017/3/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LeavedaysMapperTest {

    @Autowired
    private LeavedaysMapper leavedaysMapper;

    @Test
/*    @Parameters({"520|2016-12-12|4|A",
                 "520|2016-12-12|2|2",
                 "520|2017-12-12|8|m",
                 "520|2017-06-15|8|О",})*/
    public void insertLeaveday(){
        Leavedays leavedays = new Leavedays();
        leavedays.setUserId(520);
        leavedays.setLeaveDay("2016-12-12");
        leavedays.setLeaveTime(4);
        leavedays.setReasonId("A");
        leavedaysMapper.insertLeaveday(leavedays);
    }
}
