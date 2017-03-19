package com.high.job.controller;

import com.high.job.response.LeavedaysReponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LeavedaysControllerTest {

    @Autowired
    private LeavedaysController leavedaysController;

    @Test
    public void getMonthLeaveday(){
        List<LeavedaysReponse> leavedays = leavedaysController.getMonthLeaveday("2017-03");
        leavedays.stream().forEach(leaveday -> System.out.println(leaveday.getName()));
    }
}
