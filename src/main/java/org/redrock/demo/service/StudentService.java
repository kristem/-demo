package org.redrock.demo.service;

import org.redrock.demo.dao.StudentMapper;
import org.redrock.demo.po.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;

    public void addStu(Student student) {
        if(!studentMapper.insertStudent(student)) {
            System.out.println("添加学生错误");
        }
    }

    public void deleteStu(Integer id) {
        if(!studentMapper.deleteStudent(id)) {
            System.out.println("删除学生错误");
        }
    }

    public void updateStu(Student student) {
        if(!studentMapper.updateStudent(student)) {
            System.out.println("修改学生错误");
        }
    }

    public String getStuById(Integer id) {
        String name = studentMapper.findStuById(id);
        if(name == null) {
            System.out.println("getStuById错误");
            return "";
        }
        return name;
    }

    public Integer getStuByName(String name) {
        Integer id = studentMapper.findStuByName(name);
        if(id == null) {
            System.out.println("getStuByName");
            return -1;
        }
        return id;
    }
}
