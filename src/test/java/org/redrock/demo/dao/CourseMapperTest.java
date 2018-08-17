package org.redrock.demo.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redrock.demo.po.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseMapperTest {
    @Autowired
    private CourseMapper courseMapper;
    private Course course;

    @Before
    public void before() {
        course = new Course();
        course.setCozId(50);
        course.setCozName("shengyue");
        course.setCId(1);
    }

    @Test
    public void insertCourse() {
        Course course1 = new Course();
        course1.setCozId(30);
        course1.setCozName("yhsl");
        boolean flag = courseMapper.insertCourse(course1);
        assertEquals(true,flag);
    }

    @Test
    public void getCozByCozId() {
        String name = courseMapper.getCozByCozId(1);
        assertEquals("wudao",name);
    }

    @Test
    public void getCozByCozName() {
        int id = courseMapper.getCozByCozName("yanjiang");
        assertEquals(3, id);
    }

    @Test
    public void updateCourse() {
        boolean flag = courseMapper.updateCourse(course);
        assertEquals(true, flag);
    }

    @Test
    public void deleteCourse() {
        boolean flag = courseMapper.deleteCourse(2);
        assertEquals(true, flag);
    }

}
