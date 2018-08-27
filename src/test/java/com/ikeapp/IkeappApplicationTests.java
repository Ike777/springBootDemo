package com.ikeapp;

import com.ikeapp.entity.Resources;
import com.ikeapp.mapper.ResourcesDao;
import com.ikeapp.service.ResourcesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.ikeapp.mapper")
public class IkeappApplicationTests {

	@Resource
	private ResourcesService resourcesService;

	@Resource
	private ResourcesDao dao;

	@Test
	public void contextLoads() {

		System.out.println(dao.test().size());

		Resources resource = new Resources();
		resource.setLevel("1");
		resource.setName("ceshi");
		resource.setCreatedTime(new Date());
		resource.setUpdateTime(new Date());
		resource.setResKey("ce");
		resource.setUrl("/////");
		resource.setResKey("fffff");
		resource.setDescription("cccccc");
		resource.setId(3);
		resource.setParentId(1);
		resource.setType("2");
		resource.setResUrl("///////");
		dao.insert(resource);
		//resourcesService.insert(resource);
		//dao.selectOne(resource);
	}

}
