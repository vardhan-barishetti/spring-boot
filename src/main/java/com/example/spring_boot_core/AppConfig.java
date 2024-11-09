package com.example.spring_boot_core;

import com.example.spring_boot_core.comp.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("student2")
    public Student student2(){
        Student student = new Student();
        student.setName("student2");
        return student;
    }

    @Bean("student3")
    public Student student3(){
        Student student = new Student();
        student.setName("student3");
        return student;
    }

}
