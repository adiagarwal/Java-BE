package com.first_app.first_app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class app {
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
}
