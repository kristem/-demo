package org.redrock.demo.dao;

import org.redrock.demo.po.Course;


public interface CourseMapper {
    boolean insertCourse(Course course);

    String getCozByCozId(Integer id);

    Integer getCozByCozName(String name);

    boolean deleteCourse(Integer id);

    boolean updateCourse(Course course);
}
