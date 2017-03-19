package com.high.job.mapper;

import com.high.job.entity.Holidays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HolidaysMapperTest {
    public static final Logger logger = LoggerFactory.getLogger(HolidaysMapperTest.class);

    @Autowired
    private HolidaysMapper holidaysMapper;
    @Test
    public void findAllHolidaysTest(){
        List<Holidays> results = holidaysMapper.findAllHolidaysByMonth(201702);
        results.stream().forEach(
                result ->
                System.out.println(result.getAllAnnualLeave() + " "  + result.getUsers().getId() + " " + result.getUsers().getName())
        );
    }

    @Test
    public void insertTest(){
        holidaysMapper.insert(201702, 520, 15.4, 5.0, 10.4, 9.2, 3.2, 6.0);
        holidaysMapper.insert(201701, 520, 15.4, 5.0, 10.4, 9.2, 3.2, 6.0);
        holidaysMapper.insert(201702, 521, 15.4, 5.0, 10.4, 9.2, 3.2, 6.0);
    }
}
