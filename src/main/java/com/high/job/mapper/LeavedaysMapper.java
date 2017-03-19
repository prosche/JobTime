package com.high.job.mapper;

import com.high.job.entity.Leavedays;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
@Mapper
public interface LeavedaysMapper {

    @Results(value = {
            @Result(property = "users", column = "user_id", one = @One(select = "com.high.job.mapper.UsersMapper.getUserById")),
            @Result(property = "leaveDay", column = "leave_day"),
            @Result(property = "leaveTime", column = "leave_time"),
            @Result(property = "reasonId", column = "reason_id"),
            @Result(property = "createDate", column = "create_date"),
            @Result(property = "dealDate", column = "deal_date"),
    })
    @Select("SELECT * FROM LEAVE_DAYS WHERE date_format(create_date,'%Y-%m') = #{month}")
    List<Leavedays> findAllLeavedays(@Param("month") String month);

    @Results(value = {
            @Result(property = "users", column = "user_id", one = @One(select = "com.high.job.mapper.UsersMapper.getUserById")),
            @Result(property = "leaveDay", column = "leave_day"),
            @Result(property = "leaveTime", column = "leave_time"),
            @Result(property = "reasonId", column = "reason_id"),
            @Result(property = "createDate", column = "create_date"),
            @Result(property = "dealDate", column = "deal_date"),
    })
    @Select("SELECT * FROM LEAVE_DAYS WHERE STATUS = 0")
    List<Leavedays> findDealLeavedays();

    @Results(value = {
            @Result(property = "users", column = "user_id", one = @One(select = "com.high.job.mapper.UsersMapper.getUserById")),
            @Result(property = "leaveDay", column = "leave_day"),
            @Result(property = "leaveTime", column = "leave_time"),
            @Result(property = "reasonId", column = "reason_id"),
            @Result(property = "createDate", column = "create_date"),
            @Result(property = "dealDate", column = "deal_date"),
    })
    @Select("SELECT * FROM LEAVE_DAYS WHERE STATUS = 1")
    List<Leavedays> findDoneLeavedays();

    @Insert("INSERT INTO LEAVE_DAYS (user_id, leave_day, leave_time, reason_id) VALUES (#{userId}, #{leaveDay}, #{leaveTime}, #{reasonId})")
    int insertLeaveday(Leavedays leavedays);

    @Delete("DELETE FROM LEAVE_DAYS WHERE UUID = #{uuid}")
    Boolean deleteLeaveday(@Param("uuid") Integer uuid);

    @Update("UPDATE LEAVE_DAYS SET STATUS = 1 WHERE UUID = #{uuid}")
    Boolean doLeaveday(@Param("uuid") Integer uuid);
}
