package com.DataJpa.demo;

import com.DataJpa.demo.Entity.Employee;
import com.DataJpa.demo.repository.EmployeeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {


	public static void main(String[] args) {

		SpringApplication.run(JpaApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner (EmployeeRepo employeeRepo){
		return args -> {
			Employee emp =  new Employee(1l,"shami","shami@gmail.com","kandy");
			employeeRepo.save(emp);

		};
	}

}
