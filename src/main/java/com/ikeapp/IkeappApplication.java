package com.ikeapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.ikeapp.mapper")
public class IkeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(IkeappApplication.class, args);
	}
}
