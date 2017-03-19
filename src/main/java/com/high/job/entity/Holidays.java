package com.high.job.entity;

import java.io.Serializable;

/**
 * Created by yu.yang on 2017/3/18.
 */
public class Holidays  implements Serializable {

    private Integer uuid;
    private Integer opMonth;
    private Integer userId;
    private Double allAnnualLeave;
    private Double usedAnnualLeave;
    private Double unusedAnnualLeave;
    private Double allSickLeave;
    private Double usedSickLeave;
    private Double unusedSickLeave;
    private String status;

    private Users users;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOpMonth() {
        return opMonth;
    }

    public void setOpMonth(Integer opMonth) {
        this.opMonth = opMonth;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getAllAnnualLeave() {
        return allAnnualLeave;
    }

    public void setAllAnnualLeave(Double allAnnualLeave) {
        this.allAnnualLeave = allAnnualLeave;
    }

    public Double getUsedAnnualLeave() {
        return usedAnnualLeave;
    }

    public void setUsedAnnualLeave(Double usedAnnualLeave) {
        this.usedAnnualLeave = usedAnnualLeave;
    }

    public Double getUnusedAnnualLeave() {
        return unusedAnnualLeave;
    }

    public void setUnusedAnnualLeave(Double unusedAnnualLeave) {
        this.unusedAnnualLeave = unusedAnnualLeave;
    }

    public Double getAllSickLeave() {
        return allSickLeave;
    }

    public void setAllSickLeave(Double allSickLeave) {
        this.allSickLeave = allSickLeave;
    }

    public Double getUsedSickLeave() {
        return usedSickLeave;
    }

    public void setUsedSickLeave(Double usedSickLeave) {
        this.usedSickLeave = usedSickLeave;
    }

    public Double getUnusedSickLeave() {
        return unusedSickLeave;
    }

    public void setUnusedSickLeave(Double unusedSickLeave) {
        this.unusedSickLeave = unusedSickLeave;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


}
