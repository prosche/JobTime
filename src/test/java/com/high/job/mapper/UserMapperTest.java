package com.high.job.mapper;

import com.high.job.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {
    public static final Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void deleteTest(){
        usersMapper.delete(520);
    }

    @Test
    public void insertTest(){
        usersMapper.insert("520", "点点", "yuki", "2016-06-24");
    }


    @Test
    public void insertMapTest(){
        Users users = new Users();
        users.setId(521);
        users.setName("点点");
        users.setEnglishName("yuki");
        users.setCompact("2016-06-36");
        usersMapper.insertMap(users);
    }

    @Test
    public void findByNameTest(){
        Users result = usersMapper.findByName("点点");
        logger.debug("id: {}, name: {}", result.getId(), result.getName());
    }

    @Test
    public void findAllTest(){
        List<Users> results = usersMapper.findOnDutyAll();
        results.stream().forEach(result -> logger.debug("id: {}, name: {}", result.getId(), result.getName()));
    }

}
