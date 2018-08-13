package org.redrock.demo.service;

import org.redrock.demo.dao.CourseMapper;
import org.redrock.demo.po.Course;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.rmi.ServerException;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;

    public void addCoz (Course course) {
        Integer id = course.getId();
        String name = course.getName();
        if (!courseMapper.insertCourse(id, name)) {
            System.out.println("添加课程失败");
        }
    }
}
