package com.example.demo.test.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
    @Bean(name = "dataSource")
    @Primary//若有多个数据源对象，以本次创建的数据源为主
    @ConfigurationProperties(prefix = "druid")//获取application.properties配置文件中的配置项给dataSource对应的属性
    public DataSource getDataSource() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

}
