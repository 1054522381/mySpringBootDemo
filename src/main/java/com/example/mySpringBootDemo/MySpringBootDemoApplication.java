package com.example.mySpringBootDemo;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MySpringBootDemoApplication {

	/**
	 * can also type $ mvn spring-boot:run to start the application
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication.run(MySpringBootDemoApplication.class, args);
		SpringApplication app = new SpringApplication(MySpringBootDemoApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
}

