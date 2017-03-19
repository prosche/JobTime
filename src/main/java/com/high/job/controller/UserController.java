package com.high.job.controller;

import com.high.job.entity.Users;
import com.high.job.request.UserRequest;
import com.high.job.services.UserServer;
import com.high.job.util.UrlMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
@RestController
public class UserController {
    @Autowired
    private UserServer userServer;

    /**
     * API method to get all users
     *
     * @return users
     */
    @RequestMapping(value = UrlMapping.GET_USERS_PATH, method = RequestMethod.GET)
    @ResponseBody
    public List<Users> getUsedAllUsers(){
        return userServer.getUsedAllUsers();
    }

    /**
     * API method to add user
     *
     * @param userRequest
     * @return
     */
    @RequestMapping(value = UrlMapping.CREATE_USERS_PATH, method = RequestMethod.POST)
    @ResponseBody
    public int addUser(final @RequestBody @Valid UserRequest userRequest){
        int result = 0;
        if(userRequest != null){
            result = userServer.addUser(userRequest);
        }
        return result;
    }

    @RequestMapping(value = UrlMapping.DELETE_USERS_PATH, method = RequestMethod.POST)
    @ResponseBody
    public Boolean deleteUser(final @PathVariable("id") @Valid Integer id){
        return userServer.deleteUser(id);
    }

}
