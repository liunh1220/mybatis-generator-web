package com.example.demo;

import com.example.demo.config.BaseConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseConfiguration.class})
@MapperScan(basePackages = { "com.example.demo.dao" })
public class MybatisGeneratorWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisGeneratorWebApplication.class, args);
	}
}
