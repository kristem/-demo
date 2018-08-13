package org.redrock.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.redrock.demo.po.Student;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentMapper {
    @Select("select * from student where stu_id = #{id}")
    Student findStuById (@Param("id")Integer id);

    @Select("select * from student where stu_name = #{name}")
    Student findStuByName (@Param("name")String name);
}
