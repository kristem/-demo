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

    }

    @Test
    public void insertCourse() {
        Course course1 = new Course();
        course1.setCozId(30);
        course1.setCozName("商业鬼才");
        boolean flag = courseMapper.insertCourse(course1);
        assertEquals(true,flag);
    }

    @Test
    public void getCozByCozId() {
        String name = courseMapper.getCozByCozId(1);
        assertEquals("舞蹈",name);
    }

    @Test
    public void updateCourse() {
        boolean flag = courseMapper.updateCourse(course);
    }


}
