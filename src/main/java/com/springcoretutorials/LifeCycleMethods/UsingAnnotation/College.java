package com.springcoretutorials.LifeCycleMethods.UsingAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
    private String subject;
    private int marks;
    private char grade;
 @PostConstruct
    public void start(){
        System.out.println("Inside init method via annotation");
    }
  @PreDestroy
    public void end(){
        System.out.println("Inside destroy method via annotation");
    }
}
