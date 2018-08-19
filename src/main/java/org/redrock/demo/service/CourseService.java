package org.redrock.demo.service;

import org.redrock.demo.dao.CourseMapper;
import org.redrock.demo.po.Course;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;

    public void addCoz (Course course) {
        Integer id = course.getCozId();
        String name = course.getCozName();
        if (!courseMapper.insertCourse(course)) {
            System.out.println("添加课程失败");
        }
    }

    public void updateCoz (Course course) {

    }
}
