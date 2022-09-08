package com.springcoretutorials.LifeCycleMethods.UsingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleConfig.xml");
        College college = (College) context.getBean("college");
        System.out.println(college.getSubject());
        System.out.println(college.getMarks());
        System.out.println(college.getGrade());
        System.out.println(college);
        context.registerShutdownHook();
    }
}
