package com.wj.altf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wj.altf.dao")
public class AltfApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltfApplication.class, args);
	}
}
