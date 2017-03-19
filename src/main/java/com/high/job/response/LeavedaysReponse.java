package com.high.job.response;

import java.sql.Timestamp;

/**
 * Created by yu.yang on 2017/3/19.
 */
public class LeavedaysReponse {

    private Integer uuid;
    private Integer userId;
    private String name;
    private String englishName;
    private String compact;
    private String leaveDay;
    private Integer leaveTime;
    private String reasonId;
    private String reason;
    private Timestamp createDate;
    private Timestamp dealDate;
    private String status;

    public LeavedaysReponse(){}

    public LeavedaysReponse(Integer uuid,Integer userId,String name,String englishName,String compact,String leaveDay,Integer leaveTime,String reasonId,String reason,Timestamp createDate,Timestamp dealDate,String status){
        this.uuid = uuid;
        this.userId = userId;
        this.name = name;
        this.englishName = englishName;
        this.compact = compact;
        this.leaveDay = leaveDay;
        this.leaveTime = leaveTime;
        this.reasonId = reasonId;
        this.reason = reason;
        this.createDate = createDate;
        this.dealDate = dealDate;
        this.status = status;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getCompact() {
        return compact;
    }

    public void setCompact(String compact) {
        this.compact = compact;
    }

    public String getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(String leaveDay) {
        this.leaveDay = leaveDay;
    }

    public Integer getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Integer leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getReasonId() {
        return reasonId;
    }

    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getDealDate() {
        return dealDate;
    }

    public void setDealDate(Timestamp dealDate) {
        this.dealDate = dealDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
