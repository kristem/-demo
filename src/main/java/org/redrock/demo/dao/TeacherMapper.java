//package org.redrock.demo.dao;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//import org.redrock.demo.po.Student;
//import org.redrock.demo.po.Teacher;
//import org.springframework.stereotype.Repository;
//
//@Repository
//@Mapper
//public interface TeacherMapper {
//    @Select("select * from teacher where tch_id = #{id}")
//    Teacher findTchById (@Param("id")Integer id);
//
//    @Select("select * from teacher where stu_name = #{name}")
//    Teacher findTchByName (@Param("name")String name);
//}
