package org.redrock.demo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StuCozMapperTest {
	@Autowired
	private StuCozMapper stuCozMapper;

	@Test
	public void findStuByCozId() {
		List<Integer> result = stuCozMapper.findStuByCozId(1);

		assertTrue(!result.isEmpty());
	}
}