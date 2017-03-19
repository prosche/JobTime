package com.high.job.services;

import com.high.job.entity.Users;
import com.high.job.request.UserRequest;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
public interface UserServer {
    List<Users> getUsedAllUsers();

    int addUser(UserRequest userRequest);

    Boolean deleteUser(Integer id);
}
