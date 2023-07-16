package com.jpa.course.JPA.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaCourseApplication {

	public static void main(String[] args) {
		System.out.println("Connected");
		SpringApplication.run(JpaCourseApplication.class, args);
	}

}
