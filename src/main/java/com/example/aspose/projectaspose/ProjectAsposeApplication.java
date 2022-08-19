package com.example.aspose.projectaspose;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectAsposeApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProjectAsposeApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(ProjectAsposeApplication.class, args);
	}

	@Bean
	public ApplicationStartupRunner schedulerRunner() {
		return new ApplicationStartupRunner();
	}
}
