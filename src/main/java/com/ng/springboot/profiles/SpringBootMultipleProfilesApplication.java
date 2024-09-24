package com.ng.springboot.profiles;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootMultipleProfilesApplication {

	public static void main(String[] args) {

		// SpringApplication.run(SpringBootMultipleProfilesApplication.class, args);

		new SpringApplicationBuilder(SpringBootMultipleProfilesApplication.class).profiles("prod").run(args);
	}

}
