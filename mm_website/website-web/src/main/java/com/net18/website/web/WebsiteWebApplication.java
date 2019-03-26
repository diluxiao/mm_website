package com.net18.website.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = {"com.net18.website.core.dao"})
@ComponentScan({"com.net18.website.web.*","com.net18.website.core"})
@EnableSwagger2
public class WebsiteWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteWebApplication.class, args);
    }

}
