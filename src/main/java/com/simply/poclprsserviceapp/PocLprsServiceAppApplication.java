package com.simply.poclprsserviceapp;

import com.simply.poclprsserviceapp.controller.LprsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.simply.poclprsserviceapp")
public class PocLprsServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocLprsServiceAppApplication.class, args);
	}

}
