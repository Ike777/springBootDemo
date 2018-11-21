package com.ikeapp.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: wei.shen
 * @date: 2018/11/1
 */

@Slf4j
@Configuration
@PropertySource(value= {"classpath:config/jdbc.properties"})
public class DataBaseConfig4MS {
    @Value("${spring.datasource.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name="writeDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource writeDataSource() {
        log.info("-------------------- writeDataSource init ---------------------");
        DataSource dataSource =  DataSourceBuilder.create().type(dataSourceType).build();

        return dataSource;
    }
    /**
     * 有多少个从库就要配置多少个
     * @return
     */
    @Bean(name = "readDataSource1")
    @ConfigurationProperties(prefix = "spring.slave")
    public DataSource readDataSourceOne(){
        log.info("-------------------- readDataSourceOne init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    @Bean(name = "readDataSource2")
    @ConfigurationProperties(prefix = "spring.read2")
    public DataSource readDataSourceTwo() {
        log.info("-------------------- readDataSourceTwo init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }
    @Bean("readDataSources")
    public List<DataSource> readDataSources() {
        List<DataSource> dataSources = new ArrayList<>();
        dataSources.add(readDataSourceOne());
        dataSources.add(readDataSourceTwo());
        return dataSources;

    }
}