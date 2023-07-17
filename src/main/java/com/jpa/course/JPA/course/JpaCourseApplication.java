package com.jpa.course.JPA.course;

import com.jpa.course.JPA.course.dao.EmployeeDAO;
import com.jpa.course.JPA.course.dao.EmployeeDAOImpl;
import com.jpa.course.JPA.course.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaCourseApplication {
	@Autowired
	static EmployeeDAO employeeDAO;

	public static void main(String[] args) {


		System.out.println("Connected");


			Employee employee = new Employee("Yossef","Mohamed",20);
		employeeDAO.save(employee);



		SpringApplication.run(JpaCourseApplication.class, args);
	}
}
