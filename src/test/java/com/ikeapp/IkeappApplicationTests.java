package com.ikeapp;

import com.ikeapp.entity.Resources;
import com.ikeapp.mapper.ResourcesMapper;
import com.ikeapp.service.impl.ResourcesServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.ikeapp.mapper*")
@Slf4j
public class IkeappApplicationTests {

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


	@Test
	public void testCost(){
		try {
			resourcesService.cost();
		} catch (Exception e) {
			log.error("Error",e);
		}
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
