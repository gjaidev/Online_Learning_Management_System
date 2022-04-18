package com.collegeProject.main;

import com.collegeProject.controller.OnlineLearningController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
@ComponentScan(value = "com.collegeProject.*")
@EntityScan(value = "com.collegeProject.model")
@EnableAutoConfiguration
@ImportAutoConfiguration
@EnableJpaRepositories(value = "com.collegeProject.repository")
public class CollegeProjectApplication {
	@Autowired
	@Qualifier("controller")
	private static OnlineLearningController onlineLearningController;

	@Autowired
	public CollegeProjectApplication(OnlineLearningController onlineLearningController) {
		CollegeProjectApplication.onlineLearningController = onlineLearningController;
	}
	public static void main(String[] args) {

		SpringApplication.run(CollegeProjectApplication.class, args);
		//controller.runningMethod();

	}
	@Bean
	public Docket productApi() {
		System.out.println("its here");
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any()).build();
	}

}
