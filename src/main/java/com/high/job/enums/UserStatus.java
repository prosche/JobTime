package com.high.job.enums;

import java.util.Arrays;

/**
 * Created by yu.yang on 2017/3/19.
 */
public enum UserStatus {
    JOB(1,"在职"), LEAVE(9,"离职"), NONE(0,"未知");

    private final Integer statusId;
    private final String statusName;

    private UserStatus(Integer id, String name) {
        this.statusId = id;
        this.statusName = name;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public static UserStatus getUserStatus(Integer userStatus){
        return Arrays.asList(values())
                .stream()
                .filter(userStatus1 -> userStatus1.getStatusId() == userStatus)
                .findFirst()
                .orElse(NONE);
    }
}
