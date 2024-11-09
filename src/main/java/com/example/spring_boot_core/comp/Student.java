package com.example.spring_boot_core.comp;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

    private String name = "default";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(){
        System.out.println("Student constructor");
    }

    public void study(){
        System.out.println(name + " Student is studying");
    }

}
