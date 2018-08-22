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
        if(!courseMapper.updateCourse(course)) {
            System.out.println("修改课程失败");
        }
    }

    public void deleteCoz (Course course) {
        Integer id = course.getCozId();
        if(!courseMapper.deleteCourse(id)) {
            System.out.println("删除课程失败");
        }
    }

    public String getCozById (Integer id) {
        String name = courseMapper.getCozByCozId(id);
        if(name == null) {
            System.out.println("getCozById错误");
            return "";
        }
        return name;
    }

    public Integer getCozByName (String name) {
        Integer id = courseMapper.getCozByCozName(name);
        if(id == null) {
            System.out.println("getCozByName错误");
            return -1;
        }
        return id;
    }
}
