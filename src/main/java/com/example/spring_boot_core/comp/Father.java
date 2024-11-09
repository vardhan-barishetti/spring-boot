package com.example.spring_boot_core.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Father {

    private Student student;

    public Father(@Qualifier("student3") Student student) {
        this.student = student;
        System.out.println("Creating Father");
    }

    public void useStudent(){
        System.out.println("Using Student");
        student.study();
    }
}
