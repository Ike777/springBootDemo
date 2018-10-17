package com.ikeapp;

import com.baomidou.mybatisplus.plugins.Page;
import com.ikeapp.entity.Resources;
import com.ikeapp.mapper.ResourcesMapper;
import com.ikeapp.service.impl.ResourcesServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.ikeapp.mapper*")
public class IkeappApplicationTests {

	Logger log = LoggerFactory.getLogger(IkeappApplicationTests.class);

	@Resource
	private ResourcesServiceImpl resourcesService;

	@Resource
	private ResourcesMapper dao;

	@Test
	public void contextLoads() {
		System.out.println(dao.test().size());
		log.info("----  Start  -----");


		List<Resources> result = resourcesService.queryByPage("all").getRecords();

		log.info("--- result:{}",result.size());


		resourcesService.insertResV2();

		result = resourcesService.queryByPage("all").getRecords();
		log.info("--- result:{}",result.size());

		log.info("----  End  -----");


	}

	/*
	private void insertResource(){
		Resources r = new Resources();
		r.setDescription("xxxxx");
		r.setUrl("ssss");
		r.setName("name");
		r.setLevel("1");
		r.setResKey("key");

		dao.insert(r);
	}
	*/

}
