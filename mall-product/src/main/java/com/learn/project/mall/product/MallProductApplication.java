package com.learn.project.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合Mybatis-plus
 * 1. 导入依赖
 * 2. 配置
 *     1)。配置数据源
 *      1.1). 导入数据库驱动
 *            引入依赖 mysql-connector-java
 *      1.2). 在application.yml里面配置数据源信息
 *     2). 配置Mybatis-plus
 *      2.1). 使用MapperScaner
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.learn.project.mall.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
