package com.high.job.response;

import java.io.Serializable;

/**
 * Created by yu.yang on 2017/3/19.
 */
public class HolidaysResponse implements Serializable {

    private Integer opMonth;
    private Integer id;
    private String name;
    private String englishName;
    private String compact;
    private Double allAnnualLeave;
    private Double usedAnnualLeave;
    private Double unusedAnnualLeave;
    private Double allSickLeave;
    private Double usedSickLeave;

    public HolidaysResponse(){};

    public HolidaysResponse(Integer opMonth, Integer id, String name, String englishName, String compact, Double allAnnualLeave, Double usedAnnualLeave, Double unusedAnnualLeave, Double allSickLeave, Double usedSickLeave, Double unusedSickLeave){
        this.opMonth = opMonth;
        this.id = id;
        this.name = name;
        this.englishName = englishName;
        this.compact = compact;
        this.allAnnualLeave = allAnnualLeave;
        this.usedAnnualLeave = usedAnnualLeave;
        this.unusedAnnualLeave = unusedAnnualLeave;
        this.allSickLeave = allSickLeave;
        this.usedSickLeave = usedSickLeave;
    }
    public Integer getOpMonth() {
        return opMonth;
    }

    public void setOpMonth(Integer opMonth) {
        this.opMonth = opMonth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
