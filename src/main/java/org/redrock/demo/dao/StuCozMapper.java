package org.redrock.demo.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuCozMapper {
    List<Integer> findStuByCozId(@Param("cid") Integer cid);
}
