package com.ikeapp.config;

import com.alibaba.druid.pool.DruidDataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import javax.sql.DataSource;

/**
 * @author: wei.shen
 * @date: 2018/8/22
 */
//@Configuration
@MapperScan("com.ikeapp.mapper*")
public class DataBaseConfig {

    @Value("${spring.datasource.url}")
    String jdbcUrl;

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Value("${spring.datasource.driverClassName}")
    String driverClassName;

    @Value("${spring.datasource.initialSize}")
    int initialSize;

    @Value("${spring.datasource.minIdle}")
    int minIdle;

    @Value("${spring.datasource.maxActive}")
    int maxActive;

    @Value("${spring.datasource.maxWait}")
    int maxWait;

    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    //@Value("${spring.datasource.filters}")
    //private String filters;

    @Value("${spring.datasource.connectionProperties}")
    private String connectionProperties;


    //@Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


    //@Bean
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(jdbcUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName("com.mysql.jdbc.Driver");

        //configuration
        datasource.setInitialSize(5);
        datasource.setMinIdle(5);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(60000);
        datasource.setTimeBetweenEvictionRunsMillis(60000);
        datasource.setMinEvictableIdleTimeMillis(60000);
        datasource.setValidationQuery("SELECT 1 FROM DUAL");
        datasource.setTestWhileIdle(true);
        datasource.setTestOnBorrow(false);
        datasource.setTestOnReturn(false);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(20);
        //try {
            //datasource.setFilters(filters);
        //} catch (SQLException e) {

        //}
        datasource.setConnectionProperties(connectionProperties);

        return datasource;
    }


}
