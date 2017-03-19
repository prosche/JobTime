package com.high.job.util;

/**
 * Created by yu.yang on 2017/3/19.
 */
public class UrlMapping {
    public static final String GET_USERS_PATH = "/job/users";
    public static final String CREATE_USERS_PATH = "/job/users/create";
    public static final String DELETE_USERS_PATH = "/job/users/delete/{id}";

    public static final String GET_HOLIDAYS_PATH = "/job/holidays/{month}";

    public static final String GET_LEAVEDAYS_PATH = "/job/leave/{month}";
    public static final String CREATE_LEAVEDAYS_PATH = "/job/leave/create";
    public static final String DELETE_LEAVEDAYS_PATH = "/job/leave/delete/{uuid}";
}
