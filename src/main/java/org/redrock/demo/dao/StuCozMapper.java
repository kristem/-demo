package org.redrock.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuCozMapper {
    @Select("SELECT sid FROM stu_coz where cid = #{cid} ")
    List<Integer> findStuByCozId(@Param("cid") Integer cid);
}
