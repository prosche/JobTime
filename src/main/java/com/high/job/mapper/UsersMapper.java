package com.high.job.mapper;

import com.high.job.entity.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yu.yang on 2017/3/18.
 */
@Mapper
public interface UsersMapper {

    @Results({
            @Result(property = "englishName", column = "english_name")
    })
    @Select("SELECT * FROM USERS where name = #{name}")
    Users findByName(@Param("name") String name);

    @Results({
            @Result(property = "englishName", column = "english_name")
    })
    @Select("select * from users where id = #{id}")
    Users getUserById(Integer id);

    @Results({
            @Result(property = "englishName", column = "english_name")
    })
    @Select("SELECT * FROM USERS where status = 1")
    List<Users> findOnDutyAll();

    @Insert("INSERT INTO USERS(ID, NAME, ENGLISH_NAME, COMPACT) VALUES(#{id}, #{name}, #{englishName}, #{compact})")
    int insert(@Param("id") String id, @Param("name") String name, @Param("englishName") String englishName, @Param("compact") String compact);

    @Insert("INSERT INTO USERS(ID, NAME, ENGLISH_NAME, COMPACT) VALUES(#{id}, #{name}, #{englishName}, #{compact})")
    @Options(useGeneratedKeys = true, keyProperty = "uuid")
    int insertMap(Users users);

    @Update("UPDATE USERS SET STATUS = 0 WHERE ID = #{id}")
    Boolean delete(@Param("id") Integer id);
}
