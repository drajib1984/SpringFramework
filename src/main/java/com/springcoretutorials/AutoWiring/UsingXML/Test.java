package com.springcoretutorials.AutoWiring.UsingXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringUsingXML.xml");
        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);
    }
}
