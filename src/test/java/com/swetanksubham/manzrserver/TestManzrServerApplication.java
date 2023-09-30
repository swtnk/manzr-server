package com.swetanksubham.manzrserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestManzrServerApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestManzrServerApplication.class).run(args);
	}

}
