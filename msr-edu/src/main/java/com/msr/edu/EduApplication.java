package com.msr.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lmtting
 * @version V1.0
 * @Package com.msr.edu
 * @date 2020/6/5 15:42
 * @Copyright © 株式会社多言语系统研究所
 */
@ComponentScan(basePackages = {"com.msr.edu","com.msr.common"})
@SpringBootApplication
@MapperScan("com.msr.edu.mapper")
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}
