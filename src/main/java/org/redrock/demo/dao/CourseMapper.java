package org.redrock.demo.dao;

import org.apache.ibatis.annotations.*;
import org.redrock.demo.po.Course;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CourseMapper {
    @Insert("INSERT course(coz_id,coz_name) VALUE (#{id},#{name})")
    boolean insertCourse(@Param("id") Integer id , @Param("name") String name);

    @Delete("DELETE from course where id = #{id}  ")
    boolean deleteCourse(@Param("id")Integer id);

    @Update("UPDATE course set coz_id = #{id},coz_name = #{name} ")
    boolean updateCourse(Integer id , String name);

    @Select("SELECT * from course where coz_id = #{id}")
    Course getCozByCozId(@Param("id") Integer id);
}
