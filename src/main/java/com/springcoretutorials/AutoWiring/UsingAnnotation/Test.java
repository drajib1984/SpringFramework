package com.springcoretutorials.AutoWiring.UsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringUsingAnnotation.xml");
        Person person2 = (Person) context.getBean("person2");
        System.out.println(person2);

    }
}
