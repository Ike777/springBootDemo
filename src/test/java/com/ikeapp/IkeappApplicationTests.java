package com.ikeapp;

import com.ikeapp.entity.Resources;
import com.ikeapp.mapper.ResourcesMapper;
import com.ikeapp.service.ResourcesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.ikeapp.mapper*")
public class IkeappApplicationTests {

	Logger log = LoggerFactory.getLogger(IkeappApplicationTests.class);

	@Resource
	private ResourcesService resourcesService;

	@Resource
	private ResourcesMapper dao;

	@Test
	public void contextLoads() {
		System.out.println(dao.test().size());
		log.info("----  Start  -----");

		Resources resource = new Resources();
		resource.setId(1039792035564453889L);
		//dao.insert(resource);
		//resourcesService.insert(resource);

		log.info("Entity:{}",dao.selectOne(resource));
	}

}
