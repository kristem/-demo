package org.redrock.demo.service;

import org.redrock.demo.dao.StuCozMapper;
import org.redrock.demo.po.StuCoz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StuCozService {
    @Resource
    private StuCozMapper stuCozMapper;

    public void addStuCoz(StuCoz stuCoz) {
        if(!stuCozMapper.insertStuCoz(stuCoz)) {
            System.out.println("addStuCoz错误");
        }
    }

    public List<Integer> getStuByCoZ(Integer cozId) {
        List<Integer> list = new ArrayList<>();
        list = stuCozMapper.findStuByCozId(cozId);
        return list;
    }
}
