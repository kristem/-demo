package org.redrock.demo.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redrock.demo.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;
    private Student student;

    @Before
    public void before() {
     student = new Student();
     student.setSId(3);
     student.setStuName("dhsl");
     student.setStuId(80);
    }

    @Test
    public void insertCourse() {
        Student student1 = new Student();
        student1.setStuId(20);
        student1.setStuName("wcsl");
        boolean flag = studentMapper.insertStudent(student1);
        assertEquals(true,flag);
    }

    @Test
    public void findStudentById() {
        String name = studentMapper.findStuById(100);
        assertEquals("mmp",name);
    }

    @Test
    public void findStudentByName() {
        int id = studentMapper.findStuByName("wj");
        assertEquals(103, id);
    }

    @Test
    public void updateStudent() {
        boolean flag = studentMapper.updateStudent(student);
        assertEquals(true, flag);
    }

    @Test
    public void deleteStudent() {
        boolean flag = studentMapper.deleteStudent(101);
        assertEquals(true, flag);
    }

}
