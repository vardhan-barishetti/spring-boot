package com.example.spring_boot_core;

import com.example.spring_boot_core.comp.Father;
import com.example.spring_boot_core.comp.Student;
import com.example.spring_boot_core.controllers.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import substring.Car;

@SpringBootApplication
@ComponentScan(basePackages = {"substring","com.example.spring_boot_core"})
public class SpringBootCoreApplication {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext applicationContext =  SpringApplication.run(SpringBootCoreApplication.class, args);
//		Student student = applicationContext.getBean(Student.class);
//		student.study();
//		Car car = applicationContext.getBean(Car.class);
//		System.out.println(car);

//		Father father = applicationContext.getBean(Father.class);
//		father.useStudent();

		HomeController homeController = applicationContext.getBean(HomeController.class);
		homeController.loginUser();
		homeController.logOut();
	}

}
