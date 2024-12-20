package ru.alishev.springcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestoy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }
}
