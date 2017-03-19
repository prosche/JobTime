package com.high.job.mapper;

import com.high.job.entity.Holidays;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/19.
 */
@Mapper
public interface HolidaysMapper {

    @Results(value = {
            @Result(property = "opMonth", column = "op_month"),
            @Result(property = "users", column = "user_id", one = @One(select = "com.high.job.mapper.UsersMapper.getUserById")),
            @Result(property = "allAnnualLeave", column = "all_annual_leave"),
            @Result(property = "usedAnnualLeave", column = "use_annual_leave"),
            @Result(property = "unusedAnnualLeave", column = "unused_annual_leave"),
            @Result(property = "allSickLeave", column = "all_sick_leave"),
            @Result(property = "usedSickLeave", column = "use_sick_leave"),
            @Result(property = "unusedSickLeave", column = "unused_sick_leave")
    })
    @Select("select * from holidays where op_month = #{opMonth}")
    List<Holidays> findAllHolidaysByMonth(@Param("opMonth") Integer opMonth);

    @Results(value = {
            @Result(property = "opMonth", column = "op_month"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "allAnnualLeave", column = "all_annual_leave"),
            @Result(property = "usedAnnualLeave", column = "use_annual_leave"),
            @Result(property = "unusedAnnualLeave", column = "unused_annual_leave"),
            @Result(property = "allSickLeave", column = "all_sick_leave"),
            @Result(property = "usedSickLeave", column = "use_sick_leave"),
            @Result(property = "unusedSickLeave", column = "unused_sick_leave")
    })
    @Select("select * from holidays where id = #{id}")
    Holidays findHolidaysById(@Param("id") Integer id);

    @Results(value = {
            @Result(property = "opMonth", column = "op_month"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "allAnnualLeave", column = "all_annual_leave"),
            @Result(property = "usedAnnualLeave", column = "use_annual_leave"),
            @Result(property = "unusedAnnualLeave", column = "unused_annual_leave"),
            @Result(property = "allSickLeave", column = "all_sick_leave"),
            @Result(property = "usedSickLeave", column = "use_sick_leave"),
            @Result(property = "unusedSickLeave", column = "unused_sick_leave")
    })
    @Select("select * from holidays where id = #{id}")
    List<Holidays> findAllHolidaysById(@Param("id") Integer id);

    @Insert("insert into holidays (op_month, user_id, all_annual_leave, use_annual_leave, unused_annual_leave, all_sick_leave, use_sick_leave, unused_sick_leave) values (#{opMonth},#{id},#{allAnnualLeave},#{usedAnnualLeave},#{unusedAnnualLeave},#{allSickLeave},#{usedSickLeave},#{unusedSickLeave})")
    Integer insert(@Param("opMonth") Integer opMonth, @Param("id") Integer id, @Param("allAnnualLeave") Double allAnnualLeave, @Param("usedAnnualLeave") Double usedAnnualLeave, @Param("unusedAnnualLeave") Double unusedAnnualLeave, @Param("allSickLeave") Double allSickLeave, @Param("usedSickLeave") Double usedSickLeave, @Param("unusedSickLeave") Double unusedSickLeave);

    @Insert("insert into holidays (op_month, user_id, all_annual_leave, use_annual_leave, unused_annual_leave, all_sick_leave, use_sick_leave, unused_sick_leave) values (#{opMonth},#{userId},#{allAnnualLeave},#{usedAnnualLeave},#{unusedAnnualLeave},#{allSickLeave},#{usedSickLeave},#{unusedSickLeave})")
    Integer insertMap(Holidays holidays);

    @Update("update holidays set all_annual_leave = #{allAnnualLeave}, use_annual_leave = #{usedAnnualLeave}, unused_annual_leave = #{unusedAnnualLeave}, all_sick_leave = #{allSickLeave}, use_sick_leave = #{usedSickLeave}, unused_sick_leave = #{unusedSickLeave} where op_month = #{opMonth} and user_id = #{id}")
    int updateById(Holidays holidays);
}
