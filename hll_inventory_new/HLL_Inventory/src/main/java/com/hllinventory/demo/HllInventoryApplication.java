package com.hllinventory.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.hllinventory.demo.model"})
public class HllInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HllInventoryApplication.class, args);
	}

}
