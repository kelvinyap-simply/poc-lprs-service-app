package com.simply.poclprsserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = LprsController.class)
public class PocLprsServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocLprsServiceAppApplication.class, args);
	}

}
